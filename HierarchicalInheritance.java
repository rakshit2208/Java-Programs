class A1
{
    public void methodA()
    {
        System.out.println("Mehthod A is call");
    }
}

class B1 extends A1
{
    public void methodB()
    {
        System.out.println("Mehthod B is call");
    }
}

class C1 extends A1 
{
    public void methodC()
    {
        System.out.println("Mehthod C is call");
    }
}

class D1 extends A1 
{
    public void methodD()
    {
        System.out.println("Mehthod D is call");
    }
}

public class HierarchicalInheritance 
{
    public static void main(String[] args) 
    {
        B1 ob1 = new B1();
        C1 ob2 = new C1();
        D1 ob3 = new D1();

        ob1.methodA();
        ob2.methodA();
        ob3.methodA();
    }
}
