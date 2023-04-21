// java program to check armstrong number
import java.util.Scanner;
public class ArmstrongCheck 
{
    public static void main(String[] args) 
    {
        int num, number, rem, total = 0;

        System.out.print("Enter Any Number: ");

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        number = num;

        while(number!=0)
        {
            rem = number % 10;
            total = total + (rem*rem*rem);
            number = number/10;
        }

        if(total == num)
            System.out.println(num + " is an Armstrong number");
        
        else
            System.out.println(num + " is not an Armstrong number");

        
        sc.close();
    }
}
