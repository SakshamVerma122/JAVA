import java.util.Scanner;

public class repeatNotAllowed {
    public static int nonRepeatelement(int[] arr){
        int nonrepele =arr[0] ;

        for (int i =1 ; i< arr.length;i++) {
            nonrepele ^= arr[i];
        }
        return nonrepele;
    }
    public static void main(String[] args) {
        // Important Questions . There are many numbers that are occurring more than once but there is 
        // only one number occurring only once find that number

        Scanner sc = new Scanner(System.in);
        int []arr = new int[10];

        for(int i = 0;i<5;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(nonRepeatelement(arr));
    }
    
}
