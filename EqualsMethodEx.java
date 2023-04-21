// java program example to show equals() method
public class EqualsMethodEx
{
    public static void main(String[] args) 
    {
        String s1 = "csit";
        String s2 = "durg";
        String s3 = "CSIT";
        String s4 = new String("csit");

        // concatinate two string
        System.out.println("result1 = "+s1+s2);

        // check whether strings are equal
        System.out.println("result2 ="+s1.equals(s4)); //true because content and case is same

        // check whether s1 equal to s2
        System.out.println("result3 = "+s1==s2);   //false because address of variables are different
        
        // check whether s1 equal to s3
        System.out.println("result4 = "+s1==s3);  //false because address of variables are different

        // check whether s1 equal to s4
        System.out.println("result5 = "+s1==s4);  //false because address of variables are different

        // check whether s1 equal to s3
        System.out.println("result6 = "+s1.equals(s3)); //false because case is not same   
        
         // check whether s1 equal to s3
         System.out.println("result7 = "+s1.equalsIgnoreCase(s3)); //true because igonreuppercase of variable s3
    }
}
