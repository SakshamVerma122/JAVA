package NS_And_DT_2;

public class Datatype_5 
{
 public static void main(String[] args)
 {
    int in =10;
    float f = 5.6f;

    // as the types differ hence we need to do explicit type casting
    // Both are having sAimilar amount of bytes but floats reange is much bigger than integer
    in = f;
    
    // Requirements for Explicit type conversions
    // Here we are able to assign as the RHS's limit hasn't been exceeded
    // If LHS would have exceeded the limit it will again run from the back 
    in = (int)f;

    short sh = (short)f;

    f = in;
 }   
}
