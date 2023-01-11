package LinearSearching;

public class FindNumOfEvensInArray {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16, 18 };

        System.out.println("Number of evens in this programme are ");

        System.out.println(findEven(arr));

    }

    static int findEven(int[] arr) {

        int isEven = 0;

        for (int i : arr) {

            if (i % 2 == 0) {
                isEven++;

            }

        }

        return isEven;

    }

}
