package Inheritance;

class A{
    
    // This is a class variable
    static int y;
    
    // x is an Instance variable
    private int x;

    public int getX() {
        return x;
    }

    // a is a local variable
    public void setX(int a) {

        // this represents the current instance u are working on
        this.x = a;
    }
    

}

public class ThisInstanceLocalClass {

    public static void main(String []args)
    {

    }
    
}
