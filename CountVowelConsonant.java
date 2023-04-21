// Java Program to Count the Number of Vowels and Consonants in a Sentence
import java.util.Scanner;

public class CountVowelConsonant 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter The Sentence :- ");
        String str = s.nextLine();

        str = str.toLowerCase();

        int Countv=0;
        int Countc=0;
         
        // find length of string
        int length = str.length();

        for(int i=0;i<length;i++)
        {
               //Checks whether a character is a vowel 
              if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
        
              {
                   //Increments the vowel counter  
                   Countv++;
              }

               //Checks whether a character is a consonant    
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
            {      
                //Increments the consonant counter    
                Countc++;    
            }    
        }

        System.out.println("Number of vowels = " + Countv);    
        System.out.println("Number of consonants = " + Countc);  
        
        s.close(); 

    }
}
