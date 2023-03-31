import java.util.HashMap;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class twoSumImplementation_1 {

    public static HashMap<Integer, Integer> HashImplementation(Integer Array[],int required){
        HashMap<Integer, Integer>MAP = new HashMap<Integer, Integer>();

        for (int i = 0; i < Array.length; i++) {
            
            if(MAP.get(required - Array[i]) != null    )
            {
                System.out.printf("(%d,%d)",Array[i],(required-Array[i]));
            }
            else{
                MAP.put(Array[i], i);
            }
        }
        
        
        
        return MAP;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer T= sc.nextInt();
        Integer required = sc.nextInt();
        Integer[] Array = new Integer[1000];
        
        for (int i = 0; i < T; i++) {
            Array[i] = sc.nextInt();
            }
        
            HashMap<Integer, Integer> HashReturned = HashImplementation(Array,required);
    }
    
}
