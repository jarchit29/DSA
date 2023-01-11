package LinearSearching;


public class FindRichestPerson {

    public static void main(String[] args) {

        // There are people (number of rows ) with cash in bank accounts(Number of cols
        // ). find the richestt person

        int[][] arr = { { 2, 3, 4 }, { 3, 2, 4,10 }, { 4, 4, 1 } };

        int personSum = 0;  
        int maxSum =0 ;
        int richestCol =0;
        

        for (int rows = 0; rows < arr.length; rows++) {
            
            int sum =0;
            int prefCol = 0 ;
            
            for (int col = 0; col < arr[rows].length; col++) {
                
                
                sum += arr[rows][col];
                prefCol = rows;

            }

            personSum++;

            if(sum>maxSum){

                maxSum = sum ;
                richestCol = prefCol;

            }

        }

        System.out.println("Number of persons :- " + personSum);
        System.out.println("Max Sum of the array is " + maxSum);
        System.out.println("Richest man is man number :- "+richestCol);
        

    }
}
