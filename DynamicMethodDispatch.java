/**
 * This program is used for simple method overriding example.
 * with dynamic method dispatch.
 */
class Base
{
    public void show()
    {
        System.out.println("This is a base class");
    }
}

class Sub extends Base
{
    // overriding method
    public void show()
    {
        System.out.println("This is a derived class");
    }
}

public class DynamicMethodDispatch 
{
     //main method
    public static void main(String[] args) 
    {
        //Super class can contain subclass object.
        Base obj = new Sub();
        obj.show();

        Base obj1 = new Base();
        obj1.show();
    }
}
