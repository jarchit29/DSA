package BinarySearching.Challanges;

//Example is if an array is like this [1,2,3,5,7,7,7,7,8,9] need to find first and last occurence of target which is 7 ~ answer of the que would be [4,7];

public class FirstAndLastOccurence {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 5, 5, 5, 7, 7, 7, 8, 9 };

        System.out.println("The very much awaited ans is ");

        int ans[] = findFirstAndLastOccurence(arr, 7);

        System.out.println("First occurence :-  " + ans[0] + " Last occurence is :-  " + ans[1]);

    }

    static int[] findFirstAndLastOccurence(int[] arr, int i) {

        int[] ans = { -1, 1 };

        // These we are generating from our binary search wale algo

        ans[0] = binarySearch(arr, i, true);
        ans[1] = binarySearch(arr, i, false);

        System.out.println("In first occurence array  " + ans[0] + " Last element is " + ans[1]);
        return ans;

    }

    // This below function would be giving us a answer , first index or last index
    // of element in the array

    static int binarySearch(int[] arr, int targetVal, boolean firstIndex) {

        int start = 0;
        int end = arr.length - 1;

        int probableAnswer = -1; // Which means we have not found any answers yet

        while (start <= end) {

            int middleElement = start + (end - start) / 2; // But this may excced the value stored in int

            if (targetVal < arr[middleElement]) {

                end = middleElement - 1;

            } else if (targetVal > arr[middleElement]) {
                start = middleElement + 1;

            } else {

                // Case :- ascending order sorted array
                probableAnswer = middleElement;

                // If first index is true this means that we need to find first occurenbce in
                // the arraay

                if (firstIndex) {

                    end = middleElement - 1;

                } else {
                    start = middleElement + 1;

                }
            }

        }
        return probableAnswer;

    }

}
