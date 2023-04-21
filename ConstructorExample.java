class Employee11
{
    int id;
    String name;

    public Employee11(int i,String n)
    {
        id = i;
        name = n;
    }

    public void MyEmployee()
    {
        System.out.println(id+" "+name);
    } 
}

public class ConstructorExample 
{
    public static void main(String[] args)
     {
        Employee11 e = new Employee11(111,"Karan");

        e.MyEmployee();
    }
}
