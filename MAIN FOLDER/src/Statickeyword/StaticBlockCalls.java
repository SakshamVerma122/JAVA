package Statickeyword;

class Hello{
    
    static{
        System.out.println("Hello Static");

    }

    public Hello()
    {
        System.out.println("Hello Constructor");
    }
}

class Hello2{
    
    static{
        System.out.println("Hello2 Static");

    }

    public Hello2()
    {
        System.out.println("Hello2 Constructor");
    }
}
public class StaticBlockCalls {
    public static void main(String[] args) {
       new  Hello();
        // new Hello2();

        
    }
    
}
