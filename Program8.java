class MyThread11 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }
    }
}
class MyThread22 implements Runnable
{
    public void run()
    {
        char a = 'A';
        while(a<='J')
        {
            System.out.println(a);
            a++;
        }
    }
}
public class Program8 
{
   public static void main(String[] args)
  {
        MyThread11 t1 = new MyThread11();
        Thread a1 = new Thread(t1);

        MyThread22 t2 = new MyThread22();
        Thread a2 = new Thread(t2);

        a2.start();
        try
        {
            a2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        a1.start();
        try
        {
            a1.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
   }
    
}
