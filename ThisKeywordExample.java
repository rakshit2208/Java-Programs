public class ThisKeywordExample 
{
    // instance variable
    int a;
      
    // local variable
    ThisKeywordExample(int a)
    {
        this.a = a;
    }
    void show()
    {
        System.out.println("The value of a ="+a);
    }
    public static void main(String[] args) 
    {
        ThisKeywordExample r = new ThisKeywordExample(100);
        // System.out.println(r);

        r.show();
    }
}
