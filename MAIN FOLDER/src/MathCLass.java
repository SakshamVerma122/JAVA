// https://www.javatpoint.com/java-math

import java.lang.Math;
// abs(x) - returns the absolute value of a number (i.e., the distance between the number and zero)
// sqrt(x) - returns the square root of a number
// pow(x, y) - returns x raised to the power of y
// max(x, y) - returns the larger of two numbers
// min(x, y) - returns the smaller of two numbers
// random() - returns a random double between 0.0 (inclusive) and 1.0 (exclusive)
public class MathCLass {
    public static void main(String[] args) {
        System.out.println(Math.abs(-1.2));
        System.out.println(Math.min(1.2,2.3));
        System.out.println(Math.max(1.2,2.3));
        System.out.println(Math.sqrt(4));
        System.out.println(Math.pow(4,2));
        System.out.println(Math.random());

    }
}
