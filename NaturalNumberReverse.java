import java.util.Scanner;

public class NaturalNumberReverse 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the natural number to start from:-");

        int n = input.nextInt();
        System.out.println("Prints the natural number in reversed order from the given number :- ");
        for(int i=n;i>0;i--)
        {
            System.out.println(i);
        }

        input.close();
        
    }
}
