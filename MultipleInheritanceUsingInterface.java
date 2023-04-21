// java program multiple inheritance using interface
interface ParentA
{
	//interfaces method are only declared not defined
	public void walk();
}

//interface 2
interface ParentB
{
	//any number of methods can be declared in the interface
	public void walk();
	public void run();
}

//multiple inheritance achieved
class child11 implements ParentA,ParentB
{   
	//overidden methods 
	public void walk()
	{
		System.out.println("ParentA is walking ");
	}
    public void run()
    {
    	System.out.println("ParentB is running ");
    }
}

public class MultipleInheritanceUsingInterface 
{
    public static void main(String[] args) 
    {
        child11 object = new child11();
    	object.walk();
    	object.run();
    }
   
}
