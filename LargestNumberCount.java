// largest number count program
import java.util.Scanner;       // Import the Scanner class

public class LargestNumberCount 
{
    public static void main(String[] args) 
    {
        int maxcount = 0;
        int  element = 0;
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        
        System.out.print("Enter the  size of  the array :-");
        int n = sc.nextInt();

        System.out.println("Array size is: "+n);

        int arr[] = new int[n];
        
        System.out.println("Enter array elements :- ");

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        sc.close();

        System.out.println("Printing the elements in an array :- ");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        
        // count the largest number in an array
        for(int i=0;i<arr.length;i++)
        {
            int count = 1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }

            if(maxcount < count)
            {
                maxcount = count;
                element = arr[i];
            }
        }
        System.out.println(element + " Occurs " + maxcount + " Times ");
   
    }
}
