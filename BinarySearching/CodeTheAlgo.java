package BinarySearching;

// Binary search is used of array is sorted
// Worst case time complexity :- 0(logn);

public class CodeTheAlgo {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

        System.out.println("The very much awaited ans is ");

        int ans = binarySearch(arr, 65);

        System.out.println("Answer is " + ans);

    }

    static int binarySearch(int[] arr, int targetVal) {

        int start = 0;
        int end = arr.length - 1;
        // int middleElement = (start+end)/2; //But this may excced the value stored in
        // int
        // hence use below code to save ambiguity

        while (start <= end) {

            int middleElement = start + (end - start) / 2; // But this may excced the value stored in int

            if (targetVal < arr[middleElement]) {

                end = middleElement - 1;

            } else if (targetVal > arr[middleElement]) {
                start = middleElement + 1;

            } else {
                return middleElement;
            }

        }
        return -1;

    }

}
