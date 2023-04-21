public class WrraperClassExample 
{
    public static void main(String[] args) 
    {
        // create primitive types
    int a = 5;
    double b = 5.65;

    //converts into wrapper objects
    Integer Obj1 = Integer.valueOf(a);
    Double Obj2 = Double.valueOf(b);

    System.out.println("The value of a: " + Obj1);
    System.out.println("The value of b: " + Obj2);
    
    }
}
