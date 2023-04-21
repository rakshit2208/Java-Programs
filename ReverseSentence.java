// Java Program to Reverse a Sentence Using Recursion
import java.util.Scanner;

public class ReverseSentence 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        //Input sentence
        System.out.print("Enter Any Sentence :- ");
        String s = sc.nextLine();

        //Reverse by calling the recursive method
        String rev = reverse(s);

        //Printing the reversed sentence
        System.out.println("Reverse sentence is :- " + rev);
        sc.close();
    }

    public static String reverse(String s)
    {
        if (s.isEmpty())
        {
            return s;
        }
        
        //Calling Function Recursively
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
