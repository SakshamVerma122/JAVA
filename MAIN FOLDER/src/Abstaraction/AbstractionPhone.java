package Abstaraction;

public class AbstractionPhone {
    public static void main(String[] args) 
    {
     
        // This thing can be solved via use of abstract class
        Iphone obj = new Iphone();
        show(obj);

        SamsungS4 obj2 = new SamsungS4();
        show(obj);
        
        // This is the Solution
        Phone obj3 = new SamsungS4();
        show(obj3);

        Phone obj4 = new Iphone();
        show(obj4);

    }

    static void show(Iphone obj)
    {
        obj.showConfig();
    }

    static void show(SamsungS4 obj)
    {
        obj.showConfig();
    }

    // This is the Solution
    static void show(Phone obj)
    {
        obj.showConfig();
    }
}

abstract class Phone{
 abstract void showConfig();   
}

class Iphone extends Phone
{
    void showConfig()
    {
        System.out.println("Iphone Configuration");
    }
}

class SamsungS4 extends Phone{
    void showConfig()
    {
        System.out.println("SamsungS4 Configuration");
    }
}
