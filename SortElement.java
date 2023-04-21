import java.util.Scanner;

public class SortElement 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the numbers of names you want to sort :- ");
        int n = s.nextInt();

        String arr[]= new String[n];

        System.out.println("Enter all the names you want sort :- ");

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextLine();
        }

       
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i].compareTo(arr[j])>0)
                {
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
               
            }
        }

        System.out.println("Elements After Sorting :-");

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

        in.close();
        s.close();

    }
}
