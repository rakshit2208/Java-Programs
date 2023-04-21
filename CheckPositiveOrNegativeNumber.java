import java.util.Scanner;

public class CheckPositiveOrNegativeNumber 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Any Number :- ");
        int num = s.nextInt();

        if(num>=0)
        {
            System.out.println("Given number is positive number");
        }
        else
        {
            System.out.println("Given number is negative number");  
        }

        s.close();

    }
}
