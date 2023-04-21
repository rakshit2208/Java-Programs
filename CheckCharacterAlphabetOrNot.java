//Java Program to check whether the given character is an alphabet or not
import java.util.Scanner;

public class CheckCharacterAlphabetOrNot 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the character :- ");
        char ch = s.next().charAt(0);

        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
             System.out.print(ch+" is an Alphabet ");
        }
        else
        {
             System.out.print(ch+" is not an Alphabet ");
        }

        s.close();

    }
}
