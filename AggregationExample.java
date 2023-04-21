// Java Program to illustrate the
// Concept of Aggregation

// Address class
class Address
{
    // Attributes of Address
    String city;
    String state;
    int pincode;

    // Constructor of this class
    public Address(String city,String state,int pincode)
    {
        // this keyword refers to current instance itself
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}

// Student class
class Student
{
    // Attributes of student
    int studentid;
    String name;
    Address address;

    // constructor of this class
    public Student(int studentid,String name,Address address)
    {
        this.studentid = studentid;
        this.name = name;
        this.address = address;
    }

    //Method of student class    
    void displayDetails(Address address)
    {
         System.out.println("Student Id : "+studentid);
         System.out.println("Student Name : "+name);
         System.out.println("City : "+address.city);
         System.out.println("State : "+address.state);
         System.out.println("Pincode : "+address.pincode);

    }
}


public class AggregationExample 
{
    public static void main(String[] args) 
    {
      
        // Creating objects of Address and Student class
        Address address1 = new Address("Durg", "Chhattisgarh",491001);
        Student s = new Student(101, "Rakshit Yadav", address1);

        // print display student details
        s.displayDetails(address1);
    }
}
