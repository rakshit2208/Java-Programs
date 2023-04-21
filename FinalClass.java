final class Base1
{
    public void display()
    {
        System.out.println("Hello");
    }
}
// the line 9-15 throw error because we can not inherit final class
// class Sub extends Base
// {
//     public void show()
//     {
//         System.out.println("Hi");
//     }
// }

class SubChild1
{
    public void show()
    {
        System.out.println("This is a SubChild class");
    }
}
public class FinalClass 
{
    public static void main(String[] args) 
    {
        SubChild1 c = new SubChild1();
        c.show();
        Base1 b = new Base1();
        b.display();
    }
}
