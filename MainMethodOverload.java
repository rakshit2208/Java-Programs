
public class MainMethodOverload 
{
    public static void main(String[] args) 
    {
        System.out.println("Main Method-1");

        main("Testing");
        main(5);
        main(10,50);
    }

    public static void main(String args) {
        
        System.out.println("Main Method-2");
    }
    public static void main(int a) {
        
        System.out.println("Main Method-3");
    }
    public static void main(int a,int b) {
        
        System.out.println("Main Method-4");
    }
  
}
