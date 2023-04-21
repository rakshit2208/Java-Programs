// Java Program to illustrate the
// Concept of Abstract method
abstract class Animal
{
    abstract void makeSound();

    // this is eat method
    public void eat() 
    {
       System.out.println("I can eat.");
    }
}

class Dog extends Animal 
{

    // abstract method
    public void makeSound() 
    {
        System.out.println("Bark bark");
    }
  }

public class AbstractMethodExample 
{
    public static void main(String[] args) 
    {
        // create an object of Dog class
        Dog d = new Dog();
        d.makeSound();
        d.eat();

        // line 34 throw error because it is a abstract class.
        // Animal a = new Animal();
        // a.eat(); 
    }
}
 