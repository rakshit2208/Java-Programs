// java program to show different types of stringbuffer methods
public class StringBufferMethods 
{
    public static void main(String[] args) 
    {
        System.out.println("------------Append Method-----------");
        
        StringBuffer s = new StringBuffer("Java ");  
        StringBuffer a = s.append(" Language");           
        System.out.println(a);  

        System.out.println("------------Length Method-----------");
        StringBuffer s1 = new StringBuffer("Java is simple language");
        int n = s1.length();
        System.out.println("Length of given string is :"+n);

        System.out.println("------------Capacity Method-----------");
        StringBuffer s2 = new StringBuffer("Rakshit");
       // returns the current capacity of the String buffer i.e. 16 + 7
       System.out.println("capacity = " + s2.capacity());
       s2 = new StringBuffer(" ");
       // returns the current capacity of the String buffer i.e. 16 + 1
       System.out.println("capacity = " + s2.capacity());
      
       System.out.println("------------Reverse Method-----------");
       StringBuffer s4 = new StringBuffer("Google");  
       StringBuffer b = s4.reverse();  
       System.out.println(b); 

       System.out.println("------------Replace Method-----------");
       StringBuffer s5 = new StringBuffer("Hello");  
       StringBuffer c = s5.replace(2,5," is a good student");  
       System.out.println(c);

       System.out.println("------------Delete Method-----------");
       StringBuffer s6 = new StringBuffer("abcde");  
       StringBuffer d = s6.delete(1,3);  
       System.out.println(d);

       System.out.println("------------DeletecharAt Method-----------");
       StringBuffer s7 = new StringBuffer("He is a good boy");  
       StringBuffer e = s7.deleteCharAt(6);
       System.out.println(e);

       System.out.println("------------Insert Method-----------");
       StringBuffer s8 =new StringBuffer("Hey");  
       StringBuffer f = s8.insert(2," I Am Raj"); 
       System.out.println(f);

       System.out.println("------------CharAt Method-----------");
       StringBuffer s9 =new StringBuffer("andriod");  
      
       System.out.println( s9.charAt(1));


        
    }
}
