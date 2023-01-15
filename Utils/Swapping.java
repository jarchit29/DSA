package Utils;

class SwapTwoNumber {

    int a ,b;
    int temp ;


    public void swapNumbers(int a ,int b ){
        
        temp=a;
        a=b;
        b=temp;

    }

}

public class Swapping {
    public static void main(String[] args) {

        SwapTwoNumber swapTwoNumber = new SwapTwoNumber();

        System.out.println("Number before  swapping a :-   " + swapTwoNumber.a + "b:-  " + swapTwoNumber.b);

        swapTwoNumber.swapNumbers(7, 5);


        System.out.println("Number after swapping a :-   " + swapTwoNumber.a + "b:-  " + swapTwoNumber.b);
        
    }
}
