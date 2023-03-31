package Polymorphism;

class A
{
    int aA;
    void show()
    {
        System.out.println("In A");
    }
}
class B extends A
{
 
    A obj1 = new A();
    void defineObjectAa()
    {
        A obj1 = new A();
        obj1.aA = 10;
    }
    
    int avar;
    void show()
    {
        System.out.println("In B");
    }
}

public class DynamicMethodDispatch 
{
    public static void main(String args[]) {
        A obj1 = new A();
        A obj3 = new A();

        obj3 = obj1;
    
        A a = new B();
        a.show();
        
        // This will create a problem as avar is not defined inside A hence can't take values for it
        // a.avar =10;
    }
    
}
