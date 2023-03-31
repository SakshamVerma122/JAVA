package Statickeyword;

class Huuray{
    static int i;
    
    // It's called before the Constructor of this class
    static{
        i = 10;
        System.out.print("Hello");
    }
}
public class Staticblock {
    public static void main(String[] args) 
    {
        System.out.print("Hello main");
        Huuray var = new Huuray();
    }
    
}
