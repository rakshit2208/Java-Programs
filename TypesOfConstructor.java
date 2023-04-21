class Car 
{
    Car()
    {
        System.out.println("Default Constructor of Car class called");
    }
    String carColor;
    Car(String carColor)
    {
        this.carColor = carColor;
    }
    
    public void disp()
    {
        System.out.println("Color of the Car is : "+carColor);
    }
    public class TypesOfConstructor 
   {
       public static void main(String[] args) 
       {
           //Calling the default constructor
           Car c = new Car();
           //    Calling the parameterized constructor
           Car c2 = new Car("Blue");
           c2.disp();
       }
     
    }
}
