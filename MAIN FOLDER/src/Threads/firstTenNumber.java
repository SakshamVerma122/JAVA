package Threads;


class first10Print extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
public class firstTenNumber {
    public static void main(String[] args) {
     first10Print obj = new first10Print();
     obj.start();
    }
    
}
