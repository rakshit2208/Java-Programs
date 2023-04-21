// java program example to show length() and charAt() method
public class LengthAndCharMethod
{
    public static void main(String[] args) 
    {
        String s = "Welcome to gfg website";

        int slength = s.length();

        System.out.println("Length of given string is: "+slength);

        // print  index of 0th element 
       System.out.println("Character at 0th index is: "+ s.charAt(0));
       
       // print  index of 5th element 
       System.out.println("Character at 5th index is: "+ s.charAt(5)); 
       
       
       // The last Character is present at the string length-1 index  
        System.out.println("Character at last index is: "+ s.charAt(slength-1));  
    }
}
