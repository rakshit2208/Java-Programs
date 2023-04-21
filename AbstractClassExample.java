// Java Program to illustrate the
// Concept of Abstract class

abstract class A 
{
    // abstract method
    abstract void show();
}

class B extends A 
{
    // this is show method
    void show()
    {
        System.out.println("This is a B class");
    }
}

class C extends A 
{
    void show()
    {
        System.out.println("This is a C class");
    }
}

public class AbstractClassExample
{
    public static void main(String[] args) 
    {
        // create an object of class B
        A obj = new B();
        obj.show();

        // create an object of class C
        A obj1 = new C();
        obj1.show();
        
        // line 40 throw error because it is a abstract class.
        // A a = new A();
        // a.show();
    }
    
}
