package Threads;

class Hi extends Thread
{
    public void run()
    {
        for (int i = 0; i <=5; i++) 
        {
            System.out.println("Hi");

            try {
                // half a second
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
class Hello extends Thread{
    public void run()
    {
        for (int i = 0; i <=5; i++) 
        {
            System.out.println("Hello");
            
            try {
                // half a second
                Thread.sleep(500);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class Thread_1 {
    public static void main(String[] args)
    {
        Hi obj1 =  new Hi();
        Hello Obj2 = new Hello();

        // We have to call start()
        obj1.start();
        Obj2.start();

        obj1.run();
        Obj2.run();
    }
    
}
