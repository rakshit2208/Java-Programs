//Static binding is also known as early binding.An example of static binding is method overloading.
class Multiplication1
{
    public void mul(int x,int y)
    {
        int z = x*y;
        System.out.println("Multiplication of two numbers = " +z); 
    }
    
    public void mul(int x,int y,int z)
    {
        int a = x*y*z;
        System.out.println("Multiplication of three numbers = " +a); 
    }

}

public class StaticBindingExample 
{
    public static void main(String[] args) 
    {
        Multiplication1 ob = new Multiplication1();

        // Calling mul() method with passing two argument values. 
        ob.mul(2, 4);

        // Calling add() method with passing three argument values. 
        ob.mul(4, 2, 5);
    }
}
