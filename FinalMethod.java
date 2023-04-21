class AA 
{
    final void m1() 
    {
        System.out.println("This is a final method.");
    }
}

class BB extends AA
{
    // void m1()
    // { 
             // Compile-error! We can not override
    //     System.out.println("Illegal!");
    // }

    void display()
    {
        System.out.println("This is a example of final method");
    }
}
public class FinalMethod 
{
    public static void main(String[] args) 
    {
        BB ob = new BB();
        ob.display();
    }
}
