import java.util.Scanner;

public class RootsOfQuadraticEquation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of a: ");  
        double a = input.nextDouble();

        System.out.print("Enter the value of b: ");  
        double b = input.nextDouble();  

        System.out.print("Enter the value of c: ");  
        double c = input.nextDouble(); 

       double d = b * b - 4.0 * a * c;  
       if (d > 0.0)   
        {  
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);  
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);

            System.out.println("The roots are :- ");
            System.out.println("Root r1 = "+r1);   
            System.out.print("Root r2 = "+r2); 
        }   
      else if (d == 0.0)   
       {  
            double r1 = -b / (2.0 * a);  
            System.out.println("The root is " + r1);  
       }   
      else   
      {  
         System.out.println("Roots are not real.");  
      } 
      
      input.close();
    }
}
