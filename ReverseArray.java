import java.util.Scanner;

public class ReverseArray 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter the size of an array :-");
        int size = s.nextInt();
         
        int arr[] = new int[size];
        System.out.println("Enter array elements :- ");
        for(int i=0;i<size;i++)
        {
            arr[i] = s.nextInt();
        }

        System.out.println("Printing the elements in an array :- ");

        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }

        s.close();

        System.out.println("Reverse array elements :-");
        for(int i=size-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        
    }
}
