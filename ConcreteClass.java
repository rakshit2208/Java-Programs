// Java program to illustrate concrete class
import java.util.Scanner;

// Concrete Class
public class ConcreteClass 
{

    public static int sum(int a, int b)
    {
        return a + b;
    }

    
    public static int sub(int a, int b)
    {
        return a - b;
    }

    
    public static int product(int a, int b)
    {
        return a * b;
    }
  
    
    public static int divi(int a, int b)
    {
        return a / b;
    }
   
  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int x = sc.nextInt();

        System.out.println("Enter Second Number : ");
        int y = sc.nextInt();


        int p = sum(x,y);
        int q = sub(x,y);
        int r = product(x,y);
        int s = divi(x,y);

        // print sum
        System.out.println("Sum = " + p);

        // print subtraction
        System.out.println("Subtraction = " + q);
  
        // print product
        System.out.println("Product = " + r);

         // print divition
         System.out.println("Division = " + s);
  
        sc.close();
    }
}
