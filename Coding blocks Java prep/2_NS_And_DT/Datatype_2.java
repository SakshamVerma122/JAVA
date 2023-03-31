package NS_And_DT_2;

public class Datatype_2 {
    public static void void(String[] args) 
    {
        // Here 12 or 10 despite being int type variable  . It's mot giving any error 
        
        // Implicit Conversion
        // 1--> checking the range -128 --> 127
        // 2--> then converts int to byte implicitly means it does this automatically byte b = (byte)10; without user explicitly writting it
        byte c = 12;
        byte b = (byte)10;   

        // It can't be converted to integer implicitly as exceeds the range of (-128 --> 127)
        // byte d= 128;
        byte d = (byte)128;

        // Implicit type conversion when arithmetic operations are performed
        byte e = 10;
        // Here type has been change to integer i.e e+2 is an integer
        int d;
        d = e+2;
        e = (byte)(e +2);
        e+=2;
        

    }
    
}
