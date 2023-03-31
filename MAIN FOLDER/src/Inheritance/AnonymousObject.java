package Inheritance;

class A{

    protected int a;

    void show(){
        System.out.println();
    }
}

public class AnonymousObject {

   public static void main(String[] args)
   {
        // Use age of anonymous object saves stack memory 
    // and garbage collection occurs after use of it once
    
    
    // Refferenced object --> Use when you have to use that object multiple time or you have to 
    // assign value to a certain variable which you have to later use
    A obj1 = new A();

    // Anonymous object
    new A().show();
    new A().a = 10;
    System.out.println(new A().a);
   }
    
}
