import java.util.Scanner;

public class FibonacciSeries 
{
    public static int fibonacci(int number)
    { 
        if(number == 1 || number == 2)
        {
             return 1; 
        } 
        else
        {
            return fibonacci(number-1) + fibonacci(number-2);
        }
    }
     

    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number upto which Fibonacci series to print: "); 
        int number = s.nextInt(); 
        s.close();
        
        System.out.println("Fibonacci series upto " + number +" numbers : ");

        //printing Fibonacci series upto number
        for(int i=1; i<=number; i++)
        { 
            System.out.print(fibonacci(i) +" "); 
        }


    }
}
