import java.util.Scanner;

public class EvenOddCheck 
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        
        System.out.print("Enter Any Number :- ");
        int num = a.nextInt();

        //  check whether a number is even or odd
        
        if(num %2 == 0)
        {
            System.out.print("Given Number Is Even");
        }
        else
        {
            System.out.print("Given Number Is Odd"); 
        }

        a.close();
    }
}
