// Method Overriding Example

//Base class
class Parent1 {
    public void display1() {
        System.out.println("parent method is executed");
    }
}

//Derived or Inherited class 
class Child1 extends Parent1 {
    
    //Below method overrides the Parent display() method
    @Override
    public void display1() {
        System.out.println("child method is executed");
    }
} 
public class MethodOverriding 
{
   
   public static void main(String[] args) 
   {
       // If a Parent type reference refers 
        // to a Parent object, then Parent's 
        // display() is called 
        Parent1 p = new Parent1(); 
        p.display1(); 
  
        // If a Parent type reference refers 
        // to a Child object Child's display() 
        // is called. This is called RUN TIME 
        // POLYMORPHISM. 
        Parent1 c = new Child1(); 
        c.display1();
   }  
}
