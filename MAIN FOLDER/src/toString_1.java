class Laptop{
    String model;
    Integer price;

    public String toString(){
        return(model +":"+price);
    }
    
    // compare the equality of two objects.
    // Hence can only use Wrapper class as they are objects i.e. here you can't compare int/ Objects of classes having int as one of there attributes but can compare Integers/ Objects of classes having int as one of there attributes
    public boolean equals(Laptop that){
        if(this.model.equals(that.model) && this.price.equals(that.price)){
            // equals takes any object as a parameter Hence above we are using Integer
            return true;
        }
        else{
            return false;
        }
    }
}

public class toString_1 {
    public static void main(String[] args) {
        Laptop obj = new Laptop();
        obj.model = "Lenovo yoga";
        obj.price = 1000;

        
        // If we try printing any object it by default calls toString()
        // toString() is present in the Object class
        // getClass().getName() --> Gives the class name
        // Integer.toHexString(hashCode())
        // Here hashCode() is a number 
        //Integer.toHexString() --> Converts number to hash string
        System.out.println(obj);


        Laptop obj2 = new Laptop();
        obj2.model ="Lenovo yoga";
        obj2.price = 1000;

        if(obj == obj2){
            System.out.println("Equals ==");
        }
        if(obj.equals(obj2)){
            // it compares the hex values and is defined inside Object class
            System.out.println("Equal .equals()");
        }


        Integer x = 5;
        int y  =12;

        System.out.println(x.toString());  

        // this is different from .toString(){It's defined inside Object class has no parameter}
        // Integer.toString(y) is defined inside Integer and has 2 parameters
        System.out.println(Integer.toString(y));
        
    }    
}
