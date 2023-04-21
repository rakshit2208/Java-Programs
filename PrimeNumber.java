import java.util.Scanner;

public class PrimeNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number you want to check whether number is prime or not :- ");
        int n = sc.nextInt();
        sc.close();
        
        int i,f=0;
        
        if(n==1)
        {
            System.out.print("Given Number Is Prime Number");
        }

        else
        {
            for(i=2;i<=n/2;i++)
             {
             if(n%i==0)
              {
                f=1;
                break;
              }
             }

               if(f==0)
                {
                   System.out.println("Given Number Is A Prime Number");
                }

               else
               {
                   System.out.println("Given Number Is Not A Prime Number");
               }

        }
        
      
    }
}
