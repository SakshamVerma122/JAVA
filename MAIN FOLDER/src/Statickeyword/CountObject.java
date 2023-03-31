package Statickeyword;

class CountObjectinstances{
    // Default values of every variable is 0
    static int count;

    CountObjectinstances()
    {
        count++;
    }

}

public class CountObject 
{
 public static void main(String[] args)
 {
    CountObjectinstances obj1  = new CountObjectinstances();
    CountObjectinstances obj2  = new CountObjectinstances();
    CountObjectinstances obj3  = new CountObjectinstances();
    CountObjectinstances obj4  = new CountObjectinstances();

    System.out.print(CountObjectinstances.count);


 }
}
