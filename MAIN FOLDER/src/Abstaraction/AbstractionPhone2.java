package Abstaraction;


abstract class Phone
{
    // It will define the functions which are needed to be common 
    // in its child clas
    void show(Phone P)
    {
        P.showConfig();
    }

    abstract void showConfig();   
}
   
class Iphone extends Phone
{
   void showConfig()
   {
       System.out.println("Iphone Configuration");
   }
}

class SamsungS4 extends Phone
{
   void showConfig()
    {
       System.out.println("SamsungS4 Configuration");
    }
}
   

public class AbstractionPhone2 
{
    public static void main(String[] args)
    {
        Phone obj = new SamsungS4();
        Phone obj2 = new Iphone();
    }
}
