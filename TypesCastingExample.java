import java.util.Scanner;

public class TypesCastingExample 
{
    public static void main(String[] args) 
    {
        // Widenning casting
        char ch = 'A';
        int i = ch;
        System.out.println("Integer Value of A is: "+i);

        // Narrowing
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Integer:");
        int j = sc.nextInt();
        char c = (char)j;
        System.out.println("Character Value of Given Value is: "+c);

        sc.close();
    }
}
