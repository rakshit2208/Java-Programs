// java program to show statrsWith() and endsWith() mehod
public class StartsAndEndsWithMehod 
{
    public static void main(String[] args) 
    {
        String str = "Welcome to India";  
  
         
        // shows startsWith() considers the case sensitiveness of the charaters of a string  
        System.out.println(str.startsWith("Welcome")); // true because every character is same   
        System.out.println(str.startsWith("welcome")); // false because w and W are different  
        System.out.println(str.startsWith("Welcome to"));  // true because every character is same 
        
        // shows endsWith() considers the case sensitiveness of the charaters of a string  
        System.out.println(str.endsWith("a")); // true because every character is same   
        System.out.println(str.endsWith("dia")); // true because every character is same   
        System.out.println(str.endsWith("A"));  // false because A and a are different 
    }
}
