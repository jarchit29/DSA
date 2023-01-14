package BinarySearching.Challanges;

// Mountain array means , that elements are first sorted as ascending then as descending..! peak element shall be the one which is largest of all (GOAT)

public class FindPeakInMountainArray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7,8, 6, 4, 2, 1 };

        System.out.println("The very much awaited ans is ");

        int ans = peakInTheArray(arr);

        System.out.println("Answer is " + ans);
    }

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

        return arr[end];

    }

}
