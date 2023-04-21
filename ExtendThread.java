// Java program to illustrate defining Thread
// by extending Thread class
class NewThread extends Thread
{
    NewThread()
    {
        // creating a new thread , second thread
        super("Demo Thread");
        System.out.println("Child Thread : "+this);
        start();//start the thread
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
public class ExtendThread 
{
    public static void main(String[] args) 
    {
        new NewThread();
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
