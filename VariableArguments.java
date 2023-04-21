public class VariableArguments 
{
    
    static int sum(int ...arr)
    {
        int result = 0;

        for(int a:arr)
        {
            result+=a;
        }

        return result;

    }

    public static void main(String[] args)
    {
        System.out.println("Welcome to variable arguments");

        System.out.println("The sum of 1 and 2 is = "+sum(1,2));
        System.out.println("The sum of 4 5 and 6 is = "+sum(4,5,6));
        System.out.println("The sum of 5 5 5 and 5 is = "+sum(5,5,5,5));

    }
}
