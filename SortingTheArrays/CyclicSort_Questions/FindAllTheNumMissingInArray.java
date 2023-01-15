package SortingTheArrays.CyclicSort_Questions;

import java.util.ArrayList;


public class FindAllTheNumMissingInArray {
    public static void main(String[] args) {

        int[] arr = {4, 1, 0,5, 7,6};
        

        System.out.println("Missing number from the array is ");
        System.out.println(findMissingNumber(arr));
        

    }

    static ArrayList<Integer> findMissingNumber(int[] arr) {

        // Index would always be value-1

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i]; //Index would be value if starts from 0

            if(arr[i]<arr.length&&arr[i]!=arr[correctIndex])
            {
                swapTwoNums(arr, i, correctIndex);
            }
            else{
                i++;

            }

        }

        // Search for the missing number in here 

        ArrayList<Integer> missingLi = new ArrayList<>();
        
        for (int j = 0; j < arr.length; j++) {

            if(arr[j]!=j) 
            {

                
                missingLi.add(j);
                   

            }
            
        }
        // Else 
        return missingLi;


    }

    static void swapTwoNums(int[] arr, int i, int j) {

        int temp;

        temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

    }

}



