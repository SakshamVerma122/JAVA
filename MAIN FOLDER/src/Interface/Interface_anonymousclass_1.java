package Interface;
// We implements Abstract to include multiple inheritance in our project
interface Abc{

    // By default show function is public abstract
    void show();
}

interface Pqr{
    void xyz();
}
abstract class AbcImpl implements Abc{

    // If you create an abstract class and implements an interface for that class then you will not get the error as it's not treated as a concrete class

}

abstract class AbcImpl2 implements Abc,Pqr{

    // This will give error if you don't define show function 
    public void show()
    {
        // If you don't put public in front it will give erro for reducing the visibility
    }

}
public class Interface_anonymousclass_1 
{
    public static void main(String[] args) {

        // We can't create the object directly of an interface unless all the abstract methods / arguements are defined inside it ...
        // To counter that we can create anonymous inner classes like the below
        // Here we are not creatin the object of Abc but the object of anonymous inner class
        Abc obj = new Abc() {
            public void show()
            {
                System.out.println("Hello Bhaiya");
            }
            
        };

        obj.show();
        
    }
}
  