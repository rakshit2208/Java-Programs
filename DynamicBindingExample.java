// Dynamic binding is also called late binding or runtime binding.An example of dynamic binding is method overriding.

class Super
{
    public void display()
    {
        System.out.println("This is the method of super class");
    }
}

class Child extends Super
{
    public void display()
    {
        System.out.println("This is the method of child class");
    }
}


public class DynamicBindingExample 
{
    public static void main(String[] args) 
    {
        Super s1 = new Super();
        // It will call display() method of Super class because the reference variable is pointing to object of super class. 
        s1.display();

        // It will call display() method of Child class because the reference variable is pointing towards the object of Child class.
        Super s2 = new Child();
        s2.display();
    }
}
