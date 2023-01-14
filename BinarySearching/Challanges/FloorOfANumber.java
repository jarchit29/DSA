package BinarySearching.Challanges;

// Floor of a number is to find largest small element then nnumber 

public class FloorOfANumber {
    
    public static void main(String[] args) {

        int[] arr = { 1, 3, 4,5, 6, 7, 8, 9, 10, 11 };

        System.out.println("The very much awaited ans is ");

        int ans = binarySearch(arr, 2);

        System.out.println("Ceiling of the number is " + ans);

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

                return arr[middleElement];

            }

        }
        
        return arr[end];

    }

}

