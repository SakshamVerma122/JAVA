package NS_And_DT_2;

public class Datatype_3 
{
 public static void main() 
 {
   int i= 1000000000;


   // Implicit typeconversion works automatically for short and long as literals whose by default types are integer there is no chance of them exceeding the alloted range.....

   // This is giving errors as by default literal without decimal dots are integer and it exceeds the range of integer
   long ln1 = 10000000000;  
   long ln2 = (long)(10000000000);

   long ln = 10000000000L;  
 }   
}
