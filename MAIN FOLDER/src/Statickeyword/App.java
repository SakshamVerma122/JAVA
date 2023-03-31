package Statickeyword;

public class App 
{
    public static void main(String[] args)
    {
       Staticprac1 obj1 = new Staticprac1(); 
       obj1.i = 5;

       // Static methods and variable don't require object to be called
       // Static variables and methods are common amongst all the refference objects
       Staticprac1.Staticshow();
       Staticprac1.Stati =10;
    }  
}

class Staticprac1
{
    // Static variable don't need object to be instantiated
    int i;
    static int Stati;
    
    public void show()
    {
        System.out.println("Hi");
        
        // Non-static methods can access any static method
        //and static variable, without creating an instance 
        //of the object.
        
        Stati =100;
    }

    public static void Staticshow()
    {   
        // What is this a staic variable or a non static variable
        int k;
        
        // Non static variable can't be used in a static method
        System.out.println("Hi");

        Stati = 10;
        
    }
}