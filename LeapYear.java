import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args) 
    {
        Scanner r = new Scanner(System.in);
        
        System.out.print("Enter Year :- ");
        int year = r.nextInt();

        if (year % 400 == 0) 
        {
            System.out.println(year + " is a leap year.");

        } 

        else if (year % 100 == 0)
        {
            System.out.println(year + " is not a leap year.");

        } 

        else if (year % 4 == 0) 
        {
            System.out.println(year + " is a leap year.");
        } 

        else 
        {
            System.out.println(year + " is not a leap year.");
        }
        r.close();
    }
}
