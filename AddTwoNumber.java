import java.util.Scanner;

public class AddTwoNumber 
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       System.out.print("Enter First Number:- ");
       int num1 = s.nextInt();
       
       System.out.print("Enter Second Number :- ");
       int num2 = s.nextInt();

       //Add two numbers
       int sum;
       sum = num1 + num2; 

       System.out.print("Sum = "+sum);

       s.close();
       
    }
}
