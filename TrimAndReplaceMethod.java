// java program to show trim() and replace method

public class TrimAndReplaceMethod 
{
    public static void main(String[] args) 
    {
        System.out.println("--------------Trim Method--------------");
        String s1 = "  hello world  "; 

        System.out.println("Length of string s1 before trim :"+s1.length()); 
        
        System.out.println(s1); //Without trim() 

        String s2 = s1.trim();   

        System.out.println("Length of string s1 after trim :"+s2.length());    
        System.out.println(s2); //With trim()  

        // Replace method
        System.out.println("--------------Replace Method--------------");
        
        String str1 = "CAR";
 
        // Replaced the character 'R' with 'T'
        String str2 = str1.replace('R', 'T');
 
        // Printed the Original String
        System.out.println("The Original String str1 is: " + str1);
 
        // Printed the Final String after replace() operation
        System.out.println("The Final String str2 is: " + str2);

        // repalceFirst() method
        String str3 = "hello hello";
        // Printed the Original String
        System.out.println("The Original String str3 is: " + str3);
         
        // Replaced the first occurrence of 'P' with 'Q'
        String str4 = str3.replaceFirst("h", "H");
         
        // Printed the Final String after replace() operation
        System.out.println("The Final String str4 is: " + str4);
 
    }
}
