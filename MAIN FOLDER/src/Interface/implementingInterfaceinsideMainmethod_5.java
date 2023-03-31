package Interface;

public class implementingInterfaceinsideMainmethod_5 implements MyInterface {
    public static void main(String[] args) {
        implementingInterfaceinsideMainmethod_5 mainClass = new implementingInterfaceinsideMainmethod_5();
      mainClass.myMethod();
    }
  
    @Override
    public void myMethod() {
      // implementation of myMethod
    }
  }
  
  interface MyInterface {
    void myMethod();
  }
  
