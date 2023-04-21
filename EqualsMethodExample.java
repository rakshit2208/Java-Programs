import java.util.Scanner;

// equals() method is used to  compares the two given strings based on the content of the string.
public class EqualsMethodExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First String :- ");
        String str1 = sc.nextLine();   //reads string   

        System.out.print("Enter Second String :- ");
        String str2 = sc.nextLine();   //reads string   

        if(str1.equals(str2))
        {
            System.out.println("Both strings are equal");  
        }
        else
        {
            System.out.println("Both strings are unequal");   
        }

        sc.close();
    }
}
