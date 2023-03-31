public class Wrapperclasses 
{
    // Because of the primitive datatypes Java is not fully a Object oriented language

    // It's good as it helps java to increase the performance --> It's not saved in a heap memory as an object which will be time consuming

    // There are certain features in Java which always works with objects Example java collections only 
    public static void main(String[] args) {
        int num = 0;

        // AutoBoxing
        Integer num2  = 8;
        Integer num4 = num;

        // Boxing where we store a primitive value in  a object
        Integer num3  = new Integer(8);

        // unboxing store a object value in  a primitive
        int num5 = num2.intValue();

        // Auto unboxing
        int num6 = num2;

    }
    
}
