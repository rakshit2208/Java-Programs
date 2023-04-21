// Java program to illustrate defining Thread
// by implements Runnable interface

class MyThread1 implements Runnable
{
    public void run()
    {
        System.out.println("I Am A Thread1 Class");
    }
}
class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("I Am A Thread2 Class");
    }
}
public class ThreadClassEx2 
{
    public static void main(String[] args) 
    {
        MyThread1 t1 = new MyThread1();
        Thread r1 = new Thread(t1);

        MyThread2 t2 = new MyThread2();
        Thread r2 = new Thread(t2);

        r1.start();
        r2.start();
    }
}
