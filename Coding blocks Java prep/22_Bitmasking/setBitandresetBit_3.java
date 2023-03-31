public class setBitandresetBit_3 {
    static int setbit(int num, int posn)
    {
        //  Think of it as 1*(2**(posn-1))
        return num | (1<<(posn-1));
    }
    static int reSetbit(int num, int posn)
    {
        //  Think of it as 1*(2**(posn-1))
        return num & (~(1<<(posn-1)));
    }
    public static void main(String[] args) {
        System.out.println(setbit(0, 3));
        System.out.println(reSetbit(10, 2));
        
    }
    
}
