package NS_And_DT_2;

public class Datatype_7 {

    public static void main() {

        char ch = 'a';
        ch = 99;

        // To show unicode is used
        ch = 64000;
        System.out.println(ch);

        // Implicit type conversion
        int k = ch+2;
        ch = (char)(ch+ 2);

        // Compiler till compile time don't know what's the value inside the int and as it might exceed the range of char It's giving an error
        ch = k;
        k = ch;
        
    }
    
}
