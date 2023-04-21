// java program to write to a file
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 
{
    public static void main(String[] args) 
    {
        // write to a file
        try 
        {
            FileWriter fileWriter = new FileWriter("file1.txt");
            fileWriter.write("Java is a simple language.\nJava is a plattform independent language.\nJava is object oriented language.");
            fileWriter.close();
            System.out.println("File written successfully.");
        } 
        catch (IOException e) 
        {
           System.out.println("Unable to write in this file"+e.getMessage());
        }
    }
}
