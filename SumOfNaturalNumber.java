import java.util.Scanner;

public class SumOfNaturalNumber 
{
    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a number you want to calculate sum :- ");
        int n = s1.nextInt();

        int sum = 0;

        for(int i=1;i<=n;i++)
        {
            sum = sum + i;
        }

        System.out.printf("Sum  Of  %d  Natural  Number = %d",n,sum);

        s1.close();


    }
}
