import java.util.Scanner;

public class FactorialNmber {
    
    public static void main(String args[])
    {
        int i;
        int fact=1;
        int num;
        System.out.print("Enter a number you want to calculate factorial :- ");
        Scanner sc = new Scanner(System.in); 
        num = sc.nextInt();  
        sc.close();  
        for(i=1;i<=num;i++)
        {    
            fact=fact*i;    
        } 
           
        System.out.println("Factorial of "+num+" is: "+fact);
           
    }
}
