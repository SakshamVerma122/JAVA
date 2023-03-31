class A{
    // Use of Inner class 
    // Inner classes are used if you want to create a datatype/ class limited to that classes scope
    class B{
        void show(){
            System.out.println("In the inner class B");
        }

    }
    // Static method for a class can only be used for a class which is inner class
    // For class A you can't use static keyword
    static class C{

    }
}
public class innerclass_3 {
    public static void main(String[] args) {
        A objA = new A();
        objA.B objB = new ObjA.B();

        // For Static You don't need object
        A.C ObjC= new A.C();
    }
    
}
