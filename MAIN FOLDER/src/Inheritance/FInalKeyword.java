package Inheritance;

// When final keyword is used along with class then that class can't be inherited
final class c
{
    int b;
    void show(
        System.out.println("In c");
    )
}

class D extends c{

}
class A{
    // As final keyword is used with method hence can't re-define the function in the base class
    final public void show()
    {
        System.out.println("In A");
    }

}

class B extends A{

    public void show()
    {
        System.out.println("In B");
    }

}

public class FInalKeyword {
    public static void main(String[] args)
    {
        // Once assigned can't assign the values
        final int i=10;
        
        final int j;
        j=10;
        // After this can't change the value of j

        c obj = new c();
        c.b =20;

    }
    
}
