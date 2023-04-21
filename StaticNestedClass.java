// Java program to illustrate static nested class

// this is outer class
class OuterClass
{
    static String s = "Rakshit Yadav";  
    
    // this is inner class
    static class InnerClass
    {
        // msg method call
        void msg()
        {
            System.out.println("My Name Is "+s);
        }
    }

}
public class StaticNestedClass 
{
    public static void main(String[] args) 
    {
        // create an object of inner class
        OuterClass.InnerClass obj = new OuterClass.InnerClass();  
        obj.msg();  
    }
}
