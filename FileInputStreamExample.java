import java.io.FileInputStream;

public class FileInputStreamExample 
{
    public static void main(String[] args) 
    {
        try
        {    
            // reading data from file2.txt
            FileInputStream in = new FileInputStream("file2.txt");    
            int i=0;    
            while((i=in.read())!=-1)
            {    
               System.out.print((char)i);    
            }      
  
            in.close();    
          }
          catch(Exception e)
          { 
            System.out.println("Exception"+e.getMessage());
          }   
    }
}
