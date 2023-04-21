// Java program to illustrate anonymous inner class
class Greating 
{
    public void display()
    {
        System.out.println("Hello! I Am Greating Class");
    }
}

class India
{
    // create an object of greating class
    Greating g = new Greating()
    {
        @Override 
        public void display()
        {
            System.out.println("Namaste! I Am India Class");
        }
    };

}
class AnonymousClass
{
    public static void main(String[] args) 
    {
        // create an object of India class
        India in = new India();
        in.g.display();
    }
}