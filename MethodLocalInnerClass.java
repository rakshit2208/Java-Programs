// Java program to illustrate method local inner class
class MethodLocalInnerClass
{ 
   
     public void v1()
    { 
   
       // Method-local inner class starts here
       class InnerClass 
        { 
            public void sum(int x, int y)
             { 
                  System.out.println("Sum of two numbers : " +(x+y)); 
             } 
        } 
     
            InnerClass i = new InnerClass(); 
  
            i.sum(30, 20); 
            i.sum(50, 50); 
   
    } 
         public static void main(String[] args)
          { 
          
               // crete an object of outer class
             MethodLocalInnerClass obj = new MethodLocalInnerClass(); 
             obj.v1(); 
          } 
}