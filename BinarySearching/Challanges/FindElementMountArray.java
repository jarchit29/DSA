package BinarySearching.Challanges;

public class FindElementMountArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        System.out.println("The very much awaited ans is ");

        int ans = findInThePeak(arr, 11);

        System.out.println("Answer is " + ans);

    }

    static int findInThePeak(int[] arr, int target) {

        int ans = -1;

        // This code is only valid to ascending part of the array

        ans = binarySearch(arr, target, 0, peakInTheArray(arr));

        if (ans == -1) {
            // This code is for descending part of the array

            ans = binarySearch(arr, target, peakInTheArray(arr), arr.length - 1);

        }

        return ans;

    }

    // This is agnostic search algo just pasted it here //!Just pasted

    static int binarySearch(int[] arr, int targetVal, int start, int end) {

        char arrayType = 'a';

        if (arr[start] > arr[end]) {

            arrayType = 'd';

        }

        while (start <= end) {

            // TODO:- Take common value out in here, as in if we found element in middle

            int middleVal = start + (end - start) / 2;

            if (arrayType == 'a') {

                if (targetVal < arr[middleVal]) {

                    end = middleVal - 1;

                } else if (targetVal > arr[middleVal]) {

                    start = middleVal + 1;
                } else {
                    return middleVal;
                }
            } else {

                if (targetVal < arr[middleVal]) {

                    start = middleVal + 1;

                } else if (targetVal > arr[middleVal]) {

                    end = middleVal - 1;
                } else {
                    return middleVal;
                }
            }

        }
        return -1;

    }

    // Below is code copied from getting peak in the array //!Just pasted
    static int peakInTheArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int middleElement = start + (end - start) / 2; // But this may excced the value stored in int

            if (arr[middleElement] > arr[middleElement + 1]) {

                // This means I am in desending part of the array
                // This might be the answer you wish to , but still lets check in the left part
                // of the array

                end = middleElement;

            } else {

                // This means we are in the ascending part of the array.!

                start = middleElement + 1;

            }

        }
        // Here the condition would be that end and start would be equal and both would
        // be pointing towards my peak element

        return end;

    }

}
