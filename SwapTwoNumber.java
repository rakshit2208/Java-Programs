import java.util.Scanner;

public class SwapTwoNumber 
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);

        
        System.out.println("Enter First Number :- ");
        int a = s1.nextInt();
       

        System.out.println("Enter Second Number :- ");
        int b = s1.nextInt();

        System.out.println("Before Swap Numbers Are :-");
        System.out.println("First Number = "+a);
        System.out.println("Second Number = "+b);

        int temp ;
        s1.close();

       
        // swap two number
        temp = a;
        a = b;
        b = temp;

        
        System.out.println("After Swap Numbers Are :-");
        System.out.println("First Number = "+a);
        System.out.println("Second Number = "+b);

      
        
    }
}
