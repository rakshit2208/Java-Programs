import java.util.Scanner;

public class MethodsExample 
{
    static int sum(int x,int y)
    {
        int z = x+y;

        return z;
    }

    public int average(int x1,int y1)
    {
        int z1 = (x1+y1)/2;
        return z1;
    }

    public static void main(String[] args) 
    {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("Enter First Number :-");
        int a = s1.nextInt();
       

        System.out.println("Enter Second Number :-");
        int b = s2.nextInt(); 
        
        s1.close();
        s2.close();

        // first method to call a function
        int c = sum(a,b);
        System.out.println("Sum = "+c);

        // second method to call a function
        MethodsExample obj = new MethodsExample();
        int d = obj.average(a,b);
        System.out.println("Average = "+d);



    }
}
