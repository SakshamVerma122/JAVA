package Codes;

class dowhileprac
{
    void perf_dowhileop()
    {
        int i=0;
        do{
            System.out.println("Inside do while loop");
        }while (i>0);    
    }
}

class numseperation
{
    void print()
    {
        int a = 1_0_0_00;
        System.out.println(a);
    }
}
class Abc
{
    public Abc(int i)
    {
        System.out.println("Abc int");
    }

    // public Abc(float i)
    // {
    //     System.out.println("Abc float");
    
    // }
    
    // this is a method
    void Abc1()
    {
        System.out.println("Hello");
    }

}

class practice
{
    public static void main(String args[])
    {
        dowhileprac obj1 = new dowhileprac();
        numseperation obj2 = new numseperation();

        obj1.perf_dowhileop();
        obj2.print();

        // Abc obj = new Abc(5.0);
    }
}