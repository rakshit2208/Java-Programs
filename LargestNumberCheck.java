import java.util.Scanner;

public class LargestNumberCheck 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter First Number :- ");
        int a = s.nextInt();

        System.out.print("Enter Second Number :- ");
        int b = s.nextInt();

        System.out.print("Enter Third Number :- ");
        int c = s.nextInt();

        //comparing numbers, a with b and a with c   
          
        if(a>=b && a>=c)  
        System.out.println(a+" is the largest Number");  

       //comparing b with a and b with c  

       else if (b>=a && b>=c)  
       System.out.println(b+" is the largest Number");

       else  
       System.out.println(c+" is the largest number"); 
       
       s.close();
    }
}
