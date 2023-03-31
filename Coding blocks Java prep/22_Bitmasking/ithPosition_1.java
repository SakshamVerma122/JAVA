public class ithPosition_1 {

    public static int ithposition(int num, int posn){
        return ((num & 1<<(posn-1))!= 0 )? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(ithposition(8, 2));
        System.out.println(ithposition(8, 4));
        
    }
    
}
