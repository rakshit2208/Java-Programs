// java program to show regionMatches() method
public class RegionMatchesMethod 
{
    public static void main(String[] args) 
    {
         String Str1 = new String("Welcome to Google.com");
         String Str2 = new String("Google");
         String Str3 = new String("GOOGLE");
         String Str4 = new String("Welcome");

         // Comparing str1 and str2
        System.out.print("Result of Comparing of String 1 and String 2:- ");
        System.out.println(Str1.regionMatches(11, Str2, 0, 6));
 
        // Comparing str1 and str3
        System.out.print( "Result of Comparing of String 1 and String 3:- ");
        System.out.println(Str1.regionMatches(11, Str3, 0, 6));
 
        // Comparing str2 and str3
        System.out.print( "Result of Comparing of String 2 and String 3:- ");
        System.out.println( Str2.regionMatches(0, Str3, 0, 6));

        // Comparing str1 and str2
        System.out.print("Result of Comparing of String 1 and String 4:- ");
        System.out.println(Str1.regionMatches(0, Str4, 0, 6));
    }
}
