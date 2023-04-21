import java.util.Scanner;

public class PascalTriangle 
{
    public static void main(String[] args) 
    {
        int i,j,k,m,n;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number of rows :-");
        n = s.nextInt();

        
        System.out.println("This is the pascal triangle pattern:-");

        for(i=0;i<n;i++)
        {
            // print space
            for(k=1;k<(n-i);k++)
            System.out.print(" ");

            m = 1;
            for(j=0;j<=i;j++)
            {
            System.out.print(m+" ");
            m = (m*(i-j))/(j+1);
            }

            System.out.print("\n");   
            
        }
    }
}
