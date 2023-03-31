package Abstaraction;

abstract class MaheshPhone
{
    public void call(){
        System.out.println("Calling");
    }

    public abstract void move();
    public abstract void dance();
    public abstract void cook();
}

abstract class RameshPhone extends MaheshPhone{
    public void move()
    {
        System.out.println("Moving");
    }
    public abstract void hello();
}
class SureshPhone extends RameshPhone
{
    public void dance()
    {
        System.out.println("dancing");
    }
    public void cook()
    {
        System.out.println("Cooking");
    }
    public void hello()
    {
        System.out.println("Hello");
    }
}
public class Abstractclass {

    public static void main(String[] args)
    {
        // This has more functions that can be called than the MaheshPhone
        RameshPhone obj1 = new SureshPhone();
        obj1.call();

        MaheshPhone obj2 = new SureshPhone();
    }

    
}
