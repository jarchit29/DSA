package ArraysAndArrayList;

import java.util.Arrays;

public class Swapp {
    public static void main(String[] args) {

        int[] swapMe = { 1, 2, 3, 4, 5 };

        System.out.println("Original array is below");
        System.out.println(Arrays.toString(swapMe));

        // Swapped array is below

        // System.out.println("Swapped array is below ");
        // swap(swapMe, 0, 4);
        // System.out.println(Arrays.toString(swapMe));

        // Reverse array is below

        System.out.println("Reversed array is below");
        reverseArray(swapMe);
        System.out.println(Arrays.toString(swapMe));

    }

    static void reverseArray(int[] arr) {

        int start = 0 ;
        int end = arr.length-1;

        while(start<end){
            swap(arr ,start,end);
            start++;
            end--;
            

        }

    }

    static void swap(int[] arr, int index1, int index2) {

        int temp = arr[index1];

        arr[index1] = arr[index2];

        arr[index2] = temp;

    }
}
