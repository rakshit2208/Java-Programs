public class MultipleCatch 
{
    public static void main(String[] args) 
    {
        try
        {    
            int a[]=new int[5];    
            
            System.out.println(a[19]);  
        }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }               
           
              System.out.println("End of the Program");    
     }  
    
}

