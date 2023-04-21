import java.util.Scanner;

public class PrintInteger 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter Any Interge Number :-");
        int num = input.nextInt();
        System.out.print("Print Interger Number :-"+num);
        input.close();
    }
}
