import java.io.FileOutputStream;

public class FileOutputStreamExample
{
    public static void main(String[] args) 
    {
        String data = "My name is Rakshit Yadav.\nI am from Rasmada.";

        try 
        {
            FileOutputStream out = new FileOutputStream("file2.txt");

            // Converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // Writes data to the output stream
            out.write(dataBytes);

            // Closes the output stream
            out.close();

        }
        catch (Exception e) 
        {
            e.getStackTrace();
        }

        System.out.println("Data written successfully");

    }
}
