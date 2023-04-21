// java program example to show indexOf() method
public class IndexOfMethodEx 
{
    public static void main(String[] args) 
    {
        
        String s = "This is indexof method example";  
        
        System.out.println("Index of T is: "+s.indexOf('T'));

        System.out.println("Index of R is: "+s.indexOf('R'));

        System.out.println("Index of e is: "+s.indexOf('e'));

        System.out.println("Found e after 14th index at position: "+s.indexOf('e',14));

        System.out.println("Last Index of e is: "+s.lastIndexOf('e'));

 
    }
}
