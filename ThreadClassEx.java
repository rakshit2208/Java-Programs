// Java program to illustrate defining Thread
// by extending Thread class
public class ThreadClassEx extends Thread 
{
    public void run()
    {
        System.out.println("Run method executed by child Thread");
    }
    public static void main(String[] args) 
    {
        ThreadClassEx t = new ThreadClassEx();
        t.start();
        System.out.println("Main method executed by main thread");
    }
}
