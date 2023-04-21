class A11
{
    public void display1()
    {
        System.out.println("Class A is call");
    }
}
class B11 extends A11
{
    public void display2()
    {
        System.out.println("Class B is call");
    } 
}
class C11 extends B11
{
    public void display3()
    {
        System.out.println("Class C is call");
    } 
}
public class MultilevelInheritance 
{
    public static void main(String[] args) 
    {
        C11 obj = new C11();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
