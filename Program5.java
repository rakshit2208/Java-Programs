// Write a program to demonstrate the effect of access modifiers (default, protected, public and private) on 
// members with and without inheritance within a package and outside a package
class Abc 
{
    public void show1()
    {
        System.out.println("This is show1 method");
    }

    // private void show2()
    // {
    //     System.out.println("This is show2 method");
    // }

    protected void show3()
    {
        System.out.println("This is show3 method");
    }

    void show4()
    {
        System.out.println("This is show4 method");
    }
}
public class Program5 
{
    
    public static void main(String[] args) 
    {
        Abc obj = new Abc();
        obj.show1();
        // obj.show2();
        obj.show3();
        obj.show4();

    }
    
}
