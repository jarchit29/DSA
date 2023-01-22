import java.net.SocketTimeoutException;

// ! Difficult one , covers most of the logics
// TODO :-Rework on the logic please 


public class Pattern6 {
    public static void main(String[] args) {
        

        int n=5;

        for (int row = 0; row <2*n; row++) {


            
            int totalCols = row>n ?2 *n-row :row;
            int totalSpaces =n-totalCols ;
            

            for (int spaces = 0; spaces <totalSpaces; spaces++) {

                System.out.print(" ");
                
            }

            for (int col = 1; col <= totalCols; col++) {

                System.out.print("* ");
                
            }
            
            System.out.println("");

            
        }



    }
}
