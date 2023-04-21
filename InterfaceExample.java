import java.util.Scanner;

// Example of Interface 
interface Polygon
{
    void getArea(int length, int breadth);
}

// implement the Polygon interface
class Rectangle implements Polygon 
{

      // implementation of abstract method
      public void getArea(int length, int breadth) 
      {
          System.out.println("The area of the rectangle is =  " + (length * breadth));
      }
}


public class InterfaceExample 
{
    public static void main(String[] args)
    {
         Scanner s = new Scanner(System.in);

         System.out.print("Enter value of length :- ");
         int l = s.nextInt();

         System.out.print("Enter value of breadth :- ");
         int b = s.nextInt();

        // create object of rectangle class
        Rectangle r = new Rectangle();
        r.getArea(l,b);

        s.close();
    }
}
