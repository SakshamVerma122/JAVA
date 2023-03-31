package Interface;

interface Abc{
    void show();
}
public class TypesOfInterface_2 {
    
    public static void main(String[] args) {

        // Types of interface :

        // Marker Interface --> without methods
        // SAM --> Single Abstract Method / Function interface
        
        // Normal interface --> Normal interfaces with as many methods as possible

        // Functional Interface means only 1 abstract method was present
        Abc Obj = () -> {
            System.out.print("Hello");
        };

        // This creates a problem as interface can't create a new object
        Abc Obj2 = new Abc() ->{
                System.out.println("Hello Bhaiya");
            
        };
        
    }
}
