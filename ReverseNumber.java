// java program to reverse a number
import java.util.Scanner;
public class ReverseNumber 
{
    public static void main(String[] args) 
    {
        int rev=0;
        int rem;

      System.out.print("Enter the number that you want to reverse: ");
     
      Scanner in = new Scanner(System.in);
      
      int num = in.nextInt();
      
      while( num != 0 )
      {
          rem = num % 10;         // gives the last digit of the number  
          rev = rev * 10 + rem;
          num = num/10;            // removes the last digit of the number 
      }
      
      System.out.print("Reverse of input number is: "+rev);

      in.close();
    }

    
}
