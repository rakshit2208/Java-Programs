// java program variable types Example
public class VariableTypesEx 
{


    // public static String g = "Shubham Jain"; //Declared static variable
    public String geek; // Declared Instance Variable
 
    public VariableTypesEx()
    { // Default Constructor
 
        this.geek = "Rakshit Yadav"; // initializing Instance Variable
    }

 

    public static void main(String[] args) 
    {
        int var = 10; // Declared a Local Variable
        // This variable is local to this main method only
        System.out.println("Local Variable: " + var);

         // Object Creation
         VariableTypesEx name = new VariableTypesEx();
         // Displaying O/P
         System.out.println("My name is: " + name.geek);


            //geek variable can be accessed withod object creation
            //Displaying O/P
            //GFG.geek --> using the static variable
            // System.out.println("Geek Name is : "+VariableTypesEx.geek);
    }
}
