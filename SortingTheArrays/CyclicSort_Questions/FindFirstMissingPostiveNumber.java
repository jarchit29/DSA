package SortingTheArrays.CyclicSort_Questions;


// This is copy pasted from find missing element 

public class FindFirstMissingPostiveNumber {
    public static void main(String[] args) {

        int[] arr = { 2, 4, -1,5, 7,6};
        

        System.out.println("Missing number from the array is ");
        System.out.println(findMissingNumber(arr));
        

    }

    static int findMissingNumber(int[] arr) {

        // Index would always be value-1

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i]-1; //Index would be value if starts from 1

            if(arr[i]>0&&arr[i]<=arr.length &&arr[i]!=arr[correctIndex])
            {
                swapTwoNums(arr, i, correctIndex);
            }
            else{
                i++;

            }

        }

        // Search for the missing number in here 

        for (int j = 0; j < arr.length; j++) {

            if(arr[j]!=j+1)
            {
                return j+1;

            }
            
        }
        // Else 
        return arr.length+1; 

    }

    static void swapTwoNums(int[] arr, int i, int j) {

        int temp;

        temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

    }

}