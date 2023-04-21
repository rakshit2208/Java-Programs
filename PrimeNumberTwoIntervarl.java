import java.util.Scanner;

public class PrimeNumberTwoIntervarl 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter First Number :- ");
        int num1 = s.nextInt();

        System.out.println("Enter Second Number :-");
        int num2 = s.nextInt();

        s.close();

        for(int i=num1;i<=num2;i++)
        {
            int f=0;
            for(int j=2;j<=i/2;++j)
            { 
               if(i%j==0)
               {
                  f=1;
                  break;
               }
            }
            if(f==0)
            {
                System.out.println(i);
            }
        }
    }
}
