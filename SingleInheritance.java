class Addition 
{
    int z;

    public void add(int x,int y)
    {
        z = x+y;
        System.out.println("Sum = "+z);
    }
    
}

class Multiplication extends Addition
{
    public void mul(int x,int y)
    {
        z = x*y;

        System.out.println("The product of given number = "+z);
    } 
}

public class SingleInheritance
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 50;
    
        Multiplication ob = new Multiplication();
        ob.add(a,b);
        ob.mul(a,b);
    }
}



