class A
{
    public void show1(){
        System.out.println("in A Show");
    }
}
class B extends A
{
    public void show2(){
        System.out.println("in A Show");
    }
}
public class UpcastingandDowncasting_2 {
    public static void main(String[] args) {
        double d = 4.5;
        
        // Typecasting
        int i =(int)d;

        System.out.println(i);

        // UPCASTING
        // the process of casting an object of a subclass to an object of its superclass.
        A obj = (A) new B();
        obj.show1();
        obj.show2();

        // Downcasting
         // casting an object of a superclass to an object of its subclass
        // The object of superclass being casted is actually an instance of the target subclass.
        B obj1 = (B)obj;
    }
}
