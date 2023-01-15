package SortingTheArrays;

import java.util.Arrays;

public class InsertionSOrt {
    public static void main(String[] args) {
        

    
        int[] arr= {2,4,5,6,3,1};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
        

    }

    static void insertionSort(int[] arr) {

        for(int i = 0 ; i<arr.length-1;i++){

            for(int j=i+1;j>0;j--){

                if(arr[j]<arr[j-1]){

                    swapTwoNums(arr, j, j-1);

                }
                else{
                    break;

                }

            }

        }

    }


    static void swapTwoNums(int[] arr, int i, int j) {

        int temp;

        temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;

    }

}
