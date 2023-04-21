class ToStringMethodExample 
{
    int rollno;  
    String name;  
    
    ToStringMethodExample (int rollno, String name)
    {  
        this.rollno=rollno;  
        this.name=name;   
    }  

    public String toString()
     {
          //overriding the toString() method  
         return "My Roll No Is "+rollno +"\n" +"My Name Is "+name;  
     }  

    public static void main(String[] args) 
    {
        ToStringMethodExample  ob1=new ToStringMethodExample (101,"Raju");  
        System.out.println(ob1);          //compiler writes here s1.toString()  
   

    }


}


