package BinarySearching;

public class AgnosticOrderSearch {
    public static void main(String[] args) {

        int[] arr = { 6, 5, 4, 3, 2, 1 };

        System.out.println("The very much awaited ans is ");

        int ans = binarySearch(arr, 2);

        System.out.println("Answer is " + ans);
    }

    static int binarySearch(int[] arr, int targetVal) {

        int start = 0;
        int end = arr.length - 1;
        char arrayType = 'a';

        if (arr[start] > arr[end]) {

            arrayType = 'd';

        }

        while (start <= end) {

            // TODO:-  Take common value out in here, as in if we found element in middle

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
}
