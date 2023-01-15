package SortingTheArrays.CyclicSort_Questions;


public class OneRepeatedNumber {

    public static void main(String[] args) {

        int[] arr = { 1, 4, 3, 2, 5, 2 };

        System.out.println(findRepeatedNumber(arr));

    }

    static int findRepeatedNumber(int[] arr) {

        // Index would always be value-1

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1; // Index would be value if starts from 1
            
            if (arr[i] != arr[correctIndex]) {

                swapTwoNums(arr, i, correctIndex);
            } else {
                i++;

            }

        }

        // For finding and returning duplicates from arraay , we need to traverse this

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] != j +1) {

                return arr[j];

            }

        }
        return -1;

    }

    static void swapTwoNums(int[] arr, int i, int j) {

        int temp;

        temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

    }

}
