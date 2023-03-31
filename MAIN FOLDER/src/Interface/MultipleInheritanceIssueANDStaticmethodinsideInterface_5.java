package Interface;

interface Interface_1{
    default void show()
    {
        System.out.println("Interface_1");
    }
}

interface Interface_2{
    static void Hello()
    {
        System.out.println("Hello");
    }
    default void show()
    {
        System.out.println("Interface_2");
    }
}

interface MyDemo implements Interface_1,Interface_2{
    
    @Override
    public void show()
    {
        Interface_2.super.show();
    }
}
public class MultipleInheritanceIssueANDStaticmethodinsideInterface_5
{
    public static void main(String[] args) {
        Interface_2.Hello();
        
    }

}
