public class MultipleCatchWithFinally 
{
    public static void main(String[] args) 
    {
        try
        {
              System.out.println("This is try block");
              throw new NullPointerException("Null occurred");
        } 
        catch (NumberFormatException e) 
        {
             System.out.println("NumberFormatException"+e.getMessage());
        }      
        catch (NullPointerException e) 
        {
            System.out.println("NullPointerException: "+e.getMessage());
        }
       catch (Exception e) 
        {
          System.out.println("Exception"+e.getMessage());
        } 
       finally
        {
         System.out.println("This is finally block");
        }
    }
}
