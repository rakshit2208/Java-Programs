// Java Program to illustrate the
// Concept of Association

// company class
class Company 
{

	// Attributes of company
	private String name;

	// Constructor of this class
	Company(String name)
	{
		// this keyword refers to current instance itself
		this.name = name;
	}

	// Method of Company class
	public String getCompanyName()
	{
		// Returning name of company
		return this.name;
	}
}

// Employee class
class Employee 
{
	// Attributes of employee
	private String name;
	// Employee name
	Employee(String name)
	{
		
		this.name = name;
	}

	// Method of Employee class
	public String getEmployeeName()
	{
		
		return this.name;
	}
}



// Association between both the
// classes in main method
public class AssociationExample 
{
    public static void main(String[] args) 
    {
        // Creating objects of company and Employee class
		Company c = new Company("Bhilai Steel Plant");
		Employee emp = new Employee("Raj");

        String a = emp.getEmployeeName();
        String b = c.getCompanyName();

		// Print and display name and
		// corresponding company of employee
		System.out.println(a +" is employee of "+ b);
    }
 
}




