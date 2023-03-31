package Threads;

class Hi implements Runnable{
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
class Hello implements Runnable{
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

public class Thread_2 {
    public static void main(String[] args)
    {
        // Hi and Hello implements Runnable interface
        Runnable obj1 =  new Hi();
        Runnable Obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(Obj2);

        // We have to call start()
        t1.start();
        t2.start();
    }
    
}
