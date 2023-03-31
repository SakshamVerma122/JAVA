package Interface;
interface ABC{
    public void Abc();
}

// We can never create object of interface as a base
// for creating an object of interface we need to either implement it and use the object of the child class which has implemented it/ create a anonymous class/ lambda 
class Hello implements ABC{
    void Hello(){
        
        // Creating object of interface class via object of child class which it inherited
        ABC a = new Hello();
    }
    @Override
    public void Abc(){
        System.out.println("Hi");
    }
}

public class Practice implements ABC{
    public static void main(String[] args) {
        ABC a = new ABC(){
            public void Abc(){
                System.out.println("Hi");
            }
        };
    }
    
}
