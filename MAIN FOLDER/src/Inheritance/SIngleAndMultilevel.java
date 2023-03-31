package Inheritance;

class Add
{
    protected int num1,num2;
    protected double result;
    int i;
    
    public Add() {
        i=4;
        System.out.println("In Add");
    }
    
    double Add()
    {
        result = num1+num2;
        return result;
    }
}

class SubAdd extends Add // Single
{
    
    int i;
    // public SubAdd() 
    //{
    //      //It automatically calls super() 
    //      //Which invoke the default constructor of the super class ( by      
    //      //default_)
    // super()
    // System.out.println("In SubAdd");
    // }
    public SubAdd() {
        System.out.println("In SubAdd");
        i=10;
    }

    double Sub()
    {
        result = num1-num2;
        return result;
    }

    void UseofSuperkeyword()
    {
        // This will print values of parent class
        System.out.println(super.i);
    }
}

class MultSubAdd extends SubAdd // Multilevel
{
    
    public MultSubAdd() {
        System.out.println("MultSubAdd");
    }

    double Mult()
    {
        result = num1*num2;
        return result;
    }
}
public class SIngleAndMultilevel {
    public static void main(String []args) {
        MultSubAdd obj1 = new MultSubAdd();
        
        // obj1 is able to call  UseofSuperkeyword method as MultSubAdd inherits SubAdd

        // And it's printing 4 despite i being present in SubAdd and whose value is equal to 10 as we are returing super.i which is equal to 4
        obj1.UseofSuperkeyword();
        
    }
    
}
