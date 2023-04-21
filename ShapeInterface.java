import java.util.Scanner;

// Create a Shape Interface which has a member method area(). Derive two subclasses Circle and Triangle from 
// it. Using reference of Shape class fill the required members in Circle and Triangle also display the area of 
// Circle and Triangle. Take input from user while filling data members. 

interface Shape
{
       void area();
}

class Circle implements Shape
{
    public void area()
     {
         double pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Value of Radius :  ");
        double radius = s.nextDouble();
        
        double a = pi*radius*radius;

         System.out.println("Area of Circle is = "+a);
        
     }
}
class Triangle implements Shape
{
     public void area()
     {
         Scanner s1 = new Scanner(System.in);
         System.out.print("Enter Value of height : ");
         double h = s1.nextDouble();
    
         System.out.print("Enter Value of breadth : ");
         double b = s1.nextDouble();
        
         double c = 0.5*b*h;

         System.out.println("Area of Triangle is = "+c);
         

     }
}
public class ShapeInterface 
{
    public static void main(String[] args) 
    {
        

         // create object of Cicle Class
         Circle c = new Circle();
         c.area();

        // crearte object of Triangle Class

          Triangle t = new Triangle();
          t.area();

    }
   
}
