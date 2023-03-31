package Polymorphism;
class Parent
{
    int pvar =10;
    void show()
    {
        System.out.println("In Parent");
    }
}
class Child extends Parent
{
    int cvar = 100;
    void show()
    {
        System.out.println("In Child");
    }
}
public class ParentclassRefferenceAndChildclassObject {
    public static void main(String[] args) 
    {
     Parent obj1 = new Child();
     System.out.println(obj1.pvar);
     obj1.show();
    //  System.out.println(obj1.cvar);   
    }
    
}
