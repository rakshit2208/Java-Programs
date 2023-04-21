// java program example of string
import java.util.Scanner;
public class StringExample 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The String : ");
        String s1 = sc.nextLine();

        char ch[]={'e','x','a','m','p','l','e'}; 

        String s2=new String(ch);                     //converting char array to string    
        String s3=new String("of string");   //creating Java string by new keyword    

        System.out.println(s1);    
        System.out.println(s2);    
        System.out.println(s3);  
        
        sc.close();
    }
}
