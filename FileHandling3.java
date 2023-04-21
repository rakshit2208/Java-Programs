// java program to read to a file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling3 
{
    public static void main(String[] args) 
    {
        // Reading a file
        File myFile = new File("file1.txt");
        try 
        {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                System.out.println(line);
            }
            
            sc.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Unable to read in this file"+e.getMessage());
        }
    }
}
