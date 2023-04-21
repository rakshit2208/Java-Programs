// Java program to illustrate nested inner class

class Outer
{
    class Inner
    {
        void inner()
        {
            System.out.println("This is Inner class.");
        }
    }

}
public class NestedInnerClass 
{
    public static void main(String[] args) 
    {
        // create an object of Outer class
        Outer out = new Outer();

        // create an object of Inner class
        Outer.Inner o1 = out.new Inner();
        o1.inner();
    }
}
