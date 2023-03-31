package NS_And_DT_2;


public class Datatype_1 {

    public static void main(String[] args)
    {
        byte b = 10; // 1byte
        short sh = 20; // 2byte
        int in = 30; // 4byte
        long ln = 40; // 8byte

        // This is showing error as LHS(bytes)< RHS(bytes) 
        b = sh;
        b = in;
        b = ln;
        sh = in;

        // This is not showing any error as LHS(bytes) > RHS(bytes)
        sh = b;
        in = b;
        ln = b;
        
    }

}
