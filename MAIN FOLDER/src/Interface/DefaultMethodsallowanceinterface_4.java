package Interface;

@FunctionalInterface
interface Demo{

    // It's a Functional interface as don't show any type of error
    public void abc();
    // Methods that can be defined inside the interaface
    default void hello(){
        System.out.println("Hello Demo");
    }
    private void panga(){
        System.out.println("panga Demo");
    }
}

class DemoImp implements Demo{
    public void abc(){
        
    }
}
public class DefaultMethodsallowanceinterface_4 {
    public static void main(String[] args) {
        string Str = null;
        System.out.println(Str);
    }
}
