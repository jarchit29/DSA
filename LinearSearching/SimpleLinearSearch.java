package LinearSearching;

public class SimpleLinearSearch {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 34, 32, 542, 5, 213 };

        int[][] arr2D = { { 1, 2, 3 }, { 4, 5, 6, 7 }, { 8, 9, 10, 11 } };

        System.out.println("Linear search in 1 d array ");

        linearSearch(arr, 34);

        System.out.println("Linear search in 2D array");

        linearSearch2D(arr2D, 45);

    }

    static void linearSearch2D(int[][] arr2d, int toSearch) {

        int flag = 0;

        for (int row = 0; row < arr2d.length; row++) {

            for (int col = 0; col < arr2d[row].length; col++) {

                if (toSearch == arr2d[row][col]) {
                    flag = 1;
                    break;

                }

            }

        }

        if (flag == 1) {

            System.out.println("Target element was found");
        } else {
            System.out.println("Target element was not found");
        }

    }

    static void linearSearch(int[] arr, int toSearch) {

        int found = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == toSearch) {

                found = 1;
                break;

            } else {
                found = 0;

            }

        }
        if (found == 1) {

            System.out.println("Yeah we found the thief in here");

        } else {
            System.out.println("oops we cant catch the thief here");
        }

    }

}
