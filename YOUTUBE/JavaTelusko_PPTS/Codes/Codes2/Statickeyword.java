public class Statickeyword
{
    public static void main(String[] args)
    {
       Staticprac1 obj1 = new Staticprac1(); 
    }    
}

class Staticprac1
{
    public void show()
    {
        System.out.println("Hi");
    }

    public static void show()
    {
        System.out.println("Hi");
    }
}