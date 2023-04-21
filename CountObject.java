// java program to display the count of no of objects created
public class CountObject 
{

    private static int count=0;
    public CountObject()
    {
       count++; 
       System.out.println("object created"+this);
       try
       {
           finalize();
       }
       catch(Throwable e)
       {
           e.printStackTrace();
       }
    }
    
    public static void main(String[] args) 
    {
        CountObject o1 = new CountObject();  
        CountObject o2 = new CountObject(); 
        CountObject o3 = new CountObject(); 
        CountObject o4 = new CountObject(); 
        CountObject o5 = new CountObject(); 

        System.out.println("Total number of objects created = " + CountObject.count);
    }
    protected void finalize() throws Throwable
    {
        System.out.println("object garabage collected: "+this);
    }
}
