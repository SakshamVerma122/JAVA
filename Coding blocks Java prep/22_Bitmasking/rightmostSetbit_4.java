public class rightmostSetbit_4 {
    public static int RMSB(int num){
        int setPosn = 1;

        // 1 ,10,100 we are using & operation with them to get the right most set bit
        while((num & (1<< (setPosn-1))) == 0){
            setPosn +=1;
        }
        return setPosn;
    }
    public static void main(String[] args) {
        System.out.println(RMSB(8));
        
    }
    
}
