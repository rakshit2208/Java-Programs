// Java program to illustrate multiple thread
// by implements Runnable interface
class ThreadMultiple implements Runnable
{
    Thread runner;
    public ThreadMultiple()
    {
    }
    public ThreadMultiple(String threadName)
    {
        runner = new Thread(this,threadName);
        System.out.println(runner.getName());
        runner.start();
    }
    public void run()
    {
        // display info about this particular thread
        System.out.println(Thread.currentThread());

    }
}
public class MultipleThread 
{
    public static void main(String[] args) 
    {
        Thread thread1 = new Thread(new ThreadMultiple(),"thread1");
        Thread thread2 = new Thread(new ThreadMultiple(),"thread2");
        Thread thread3 = new Thread(new ThreadMultiple(),"thread3");

        thread1.start();
        thread2.start();
        thread3.start();
        try
        {
            Thread.currentThread();
            Thread.sleep(5000);

        }
        catch(InterruptedException e)
        {
            System.out.println(Thread.currentThread());
        }
    }
}
