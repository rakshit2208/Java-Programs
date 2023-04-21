// java program to check palindrome
import java.util.Scanner;
public class PalindromeCheck 
{

    public static void main(String[] args) 
    {
        int rev=0;
        int rem =0;

      System.out.print("Enter the number that you want to check palindrome or not: ");
     
      Scanner in = new Scanner(System.in);
      
      int num = in.nextInt();

      int temp = num;
      
      while( num != 0 )
      {
          rem = num % 10;         // gives the last digit of the number  
          rev = rev * 10 + rem;
          num = num/10;            // removes the last digit of the number 
      }

      if(temp==rev)
      {
          System.out.print(temp+" is palindrome");
      }

      else
      {
         System.out.print(temp+" is not palindrome");
      }
      
     

      in.close();
    }
    
}
