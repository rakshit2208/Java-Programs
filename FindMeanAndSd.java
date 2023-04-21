import java.util.Scanner;       // Import the Scanner class
public class FindMeanAndSd 
{
    public static void main(String[] args) 
    {
        double sum=0,mean;
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        
        System.out.print("Enter the  size of  the array :-");
        int n = input.nextInt();

        double arr[] = new double[n];
        
        System.out.printf("Enter %d number :- ",n);

        for(int i=0;i<n;i++)
        {
            arr[i] = input.nextInt();
            sum = sum+arr[i];
        }

        mean = sum/n;
        System.out.println("Mean = "+mean);
        input.close();

        // find standard deviation 
         for(int i=0;i<n;i++) 
	     {
		    sum+=Math.pow((arr[i]-mean),2);
	     }
	        mean = sum/(n-1);

	       double deviation = Math.sqrt(mean);

	     System.out.println("Standard Deviation = "+deviation);

 
    }
}
