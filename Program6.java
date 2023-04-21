// Write a program to show inbuilt and user defined: checked and unchecked exceptions.
// class InvalidAgeException extends Exception
// {
//         InvalidAgeException(String msg)
//         {
//           System.out.println(msg);
//         }
// }
public class Program6 
{

    public static void main(String[] args) 
    {
        // int x[ ] = {1, 2, 3, 4,6,8}; 
        // /* Here, an array contains only 6 elements but we will try to * display the value of 9th element. 
        // It should throw * ArrayIndexOutOfBoundsException */ 
        // System.out.println(x[9]);
        int a=50;
        int b=0;
        

        try 
       { 
          int x[ ] = {1, 2, 3, 4}; 
          System.out.println(x[6]); 
       } 
        // unchecked exception
       catch(ArrayIndexOutOfBoundsException e)
       { 
           System.out.println("ArrayIndexOutOfBoundsException"+e.getMessage());
       } 
       
       // unchecked exception
       try
       {
         int c=a/b;
         System.out.println("The result is "+c);
       }

       catch(ArithmeticException e1)
       {
        System.out.println("ArithmeticException"+e1.getMessage());
       }
       
      //  checked exception
       try
       {
        Class temp = Class.forName("Rakshit Yadav");
       }
       catch(ClassNotFoundException e3)
       {
         System.out.println("ClassNotFoundException "+e3.getMessage());
       }

      //  try
      //   {   
		  //         FileReader file = new FileReader("somefile.txt");
	    //   }
      // catch (FileNotFoundException e4)
      //  {
    	//       System.out.println("FileNotFoundException"+e4.getMessage());
	    //  }
      // try
      // {  
      //   Thread.sleep(1000);  
      //   System.out.println("I am try block");  

      // }
      // catch(InterruptedException e4)
      // {  
      //   throw new RuntimeException("Thread interrupted..."+e4); 
      //   // System.out.println("InterruptedException "+e4.getMessage());
      // } 
      // try
      // {
      //      a(12);
      // }
      // catch(Exception e5)
      // {
      //   System.out.println(e5);
      // } 

      // public static void a(int age) throws InvalidAgeException
      // {
      //   if(age<18)
      //   {
      //      throw new InvalidAgeException("Not eligible for voting");
      //   }
      //   else
      //   {
      //     System.out.println("eligible for voting");
      //   }
    
       
}
    
}
