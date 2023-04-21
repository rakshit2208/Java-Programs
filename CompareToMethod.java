// java program to show comparTo() method
public class CompareToMethod 
{
    public static void main(String[] args) 
    {
        String str1 = "red";  //ascii value of r=114

        String str2 = "pink"; //ascii value of p=112

        String str3 = "red";

        String str4 = "pink";

        // if string1 > string2, it returns positive number  
        // if string1 < string2, it returns negative number  
        // if string1 == string2, it returns 0 

        System.out.println("Result1 : "+str1.compareTo(str2));   //str1-str2=2

        System.out.println("Result2 : "+str2.compareTo(str1));   //str2-str1=-2

        System.out.println("Result3 : "+str1.compareTo(str3));  //str1==str2

        System.out.println("Result4 : "+str2.compareTo(str4));  //str2==str4

          
        // input string in uppercase  
        String st1 = new String("MY NAME IS RAKSHIT YADAV");  //ascii value of M=77
  
         // input string in lowercase  
        String st2 = new String("my name is rakshit yadav");  //ascii value of m=109

  
        System.out.println("Result5: "+st1.compareTo(st2));  //st1-st2=-32

        System.out.println("Result6: "+st1.compareToIgnoreCase(st2));

    }
    
}
