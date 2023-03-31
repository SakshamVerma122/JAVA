package Exceptions;

public class Exception1 {
    public static void main(String[] args) {
        int i=0,j=9;
        try {
            j= j/i;
        } catch (Exception e) {
            System.out.println("Got some errors");
        }

        // Nullpointer excpetion
        System.out.println("abc DemoImp");
    }
}
