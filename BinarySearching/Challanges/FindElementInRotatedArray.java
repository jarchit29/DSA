package BinarySearching.Challanges;

// ! Conisder solving it , bhuat logic haiiii boss

// ? TODO :- here is another question  :- find how many times a rotation array is rotated 
// ! By common sense its answer is the pivot + 1 number of times as in :- 
// !! Example :- [4,5,6,7,0,1,2] :- pivot is at index 3 hence rotation is 3+1 = 4 times , try it on a pen and a paper 


// Rotation array is example :- [4,5,6,7,1,2,3]
// Here pivot is 7

public class FindElementInRotatedArray {
    public static void main(String[] args) {

        int arr[] = { 3, 4, 5, 6, 7,8, 1, 2 };

        int answer = findElement(arr, 1);

        System.out.println(answer);

        System.out.println("Number of rotations made by this array is " + findNumberOfRotation(arr)); 

    }


    static int findNumberOfRotation (int[] arr){

        
        return findPivot(arr)+1;


    }


    static int findElement (int[] arr  , int target ){

        int ans = -1;

        int pivot = findPivot(arr);

        if(pivot==-1){ //pivot ==-1 means array is not rotated 

            binarySearchAscending(arr, target,0, arr.length-1);

        }

        if(target==arr[pivot]){

            ans = pivot ;

        }
        else{

           ans=  binarySearchAscending(arr, target, arr[0], pivot-1);

           if(ans==-1){

            ans= binarySearchAscending(arr, target, pivot+1, arr.length-1);

           }

            
        }


        return ans ;

    }

    static int binarySearchAscending (int[] arr , int target , int start , int end ){

        int middleElement = start + (end - start) / 2; // But this may excced the value stored in int

        if (target < arr[middleElement]) {

            end = middleElement - 1;

        } else if (target > arr[middleElement]) {
            start = middleElement + 1;

        } else {
            return middleElement;
        }

        return -1 ;

    }

    static int findPivot(int[] arr) {

        int start = 0;
        int end = arr.length-1;

        
        int ans=-1;
        
        
        while(start<=end){

            int mid = start + (end-start)/2;
           

            // We have 4 cases

            //Case 1

            if(mid<end && arr[mid]>arr[mid+1]){

                return mid;
            }

            // Case 2 

            if(mid>start && arr[mid]<arr[mid-1]){

                return mid-1;
            
            }

            //Case 3

            if(arr[mid]<=arr[start]){

                end= mid-1;
                
            }
            else{
                start = mid+1;
                
            }




        }
        return ans;

    }
}
