import javax.swing.text.html.FormSubmitEvent;

public class Pattern7 {
    public static void main(String[] args) {

        int n = 3;
        int originalN = n;

        n=2*n;

        for (int i = 0; i <=n; i++) {

            
            for (int j = 0; j <= n; j++) {
                // int atEveryIndex = 4;

                int atEveryIndex= originalN-Math.min(Math.min(i, j), Math.min(n-i,n-j));
                System.out.print(atEveryIndex + " ");

            }

            System.out.println("");

        }

    }
}
