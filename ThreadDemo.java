// Java program to illustrate defining Thread
// by implements Runnable interface
class NewThread1 implements Runnable
{
    
    NewThread1()
    {
        // creating a new thread , second thread
        Thread t = new Thread(this,"Demo Thread");

        System.out.println("Child Thread : "+t);
        t.start();//start the thread
    }

    public void run()
    {
        try
        {
            for(int i=4;i>=1;i--)
            {
                System.out.println("Child Thread :"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
             System.out.println("Child Thread Interrupted");
        }

        System.out.println("Exiting Child Thread");
    }
}
public class ThreadDemo 
{
    public static void main(String[] args) 
    {
        new NewThread1();
        try
        {
            for(int i=4;i>=1;i--)
            {
                System.out.println("Main Thread :"+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
             System.out.println("Main Thread Interrupted");
        }

        System.out.println("Exiting Main thread");
    }
}
