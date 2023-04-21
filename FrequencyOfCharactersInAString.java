// Java Program to Find the Frequency of Character in a String
import java.util.Scanner;
public class FrequencyOfCharactersInAString 
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);

         System.out.print("Enter The Sentance :- ");
         String str = sc.nextLine();

         // convert sentance into lowercase 
         str = str.toLowerCase();

         for(char ch ='a'; ch <='z';ch++)
         {
                int count=0;
                for(int i=0;i<str.length();i++)
                {
                   //Checks whether a character is equal equal to index of string
                   if(ch==str.charAt(i))
                   {
                     //  increments the count 
                       count++; 
                   }
                }

                if(count>0)
                {
                  //  print the frequency of each character
                   System.out.println("Frequency of "+ ch +" = "+count);
                }
         }

       sc.close();
         
      }
}
