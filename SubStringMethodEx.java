// java program example to show substring() method
public class SubStringMethodEx 
{
    public static void main(String[] args) 
    {
        String str = "This is example of substring method ";

        // prints the substring after index 8 till last index 
        System.out.println("Substring : "+str.substring(8));
        

        // prints the substring after index 5 till index 12
        System.out.println("Substring : "+str.substring(5,12));


        // prints the substring after index 0 till index 4
        System.out.println("Substring : "+str.substring(0,4));


    }
}
