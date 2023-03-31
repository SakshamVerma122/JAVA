package Random;
import java.util.Random;
import java.lang.Math;

class RandomExample {
    public static void RandFunc() {
        int randomNumber = (int) (Math.random() * 100) + 1; 
        // generates a random integer between 1 and 100
        System.out.println("Random number: " + randomNumber);
    }
}


class RandomExample2 {
    public static void RandFunc() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; 
        // generates a random integer between 1 and 100
        System.out.println("Random number: " + randomNumber);
        
        // Getting float value
        int min =1,max=100;
        float randomFloat = (float) (min + random.nextDouble() * (max - min));
        System.out.printf("FLOATING POINT VALUE: %f",randomFloat);
    }
}


public class Code_1 {
    public static void main(String[] args) {
        RandomExample r1 = new RandomExample();
        r1.RandFunc();

        RandomExample2 r2 = new RandomExample2();
        r2.RandFunc();
    }
    
}
