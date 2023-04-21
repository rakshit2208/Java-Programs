// Java program to illustrate singleton class

class Single 
{
    static Single s1 = new Single();

    private Single()
    {
        System.out.println("Constructor will invoke for only one object");
    }

    static Single getInstance()
    {
        return s1;
    }
}

public class SingletonClass
{
    public static void main(String[] args) 
    {
        Single s2 = Single.getInstance();
    }
}
