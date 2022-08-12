package InheritanceDemos.Polymorphism;

public class MethodOverLoading {


    int a;
    int b;

    void addition()
    {
        int c;
        c = a + b;
        System.out.println("c="+c);
    }

    void addition(int x) // Overloading
    {
        int c;
        c = a + x + 10;
        System.out.println("c="+c);
    }

    void addition(int x,int y) // Overloading
    {
        int c;
        c = y + x + 10;
        System.out.println("c="+c);
    }

    void addition(int x,int y,int z) // Overloading
    {
        int c;
        c = y + x +  z + 10;
        System.out.println("c="+c);
    }

    void addition(int x,double y) // Overloading
    {
        double c;
        c = y + x + 10;
        System.out.println("c="+c);
    }

    void addition(String x,String y) // Overloading
    {
        String c;
        c = y + x ;
        System.out.println("c="+c);
    }


    public static void main(String[] args) {

        MethodOverLoading ob = new MethodOverLoading();
        ob.addition();
        ob.addition(12);
        ob.addition(12,12);
        ob.addition(12,12,12);
        ob.addition(12,1.2);
        ob.addition("Java","Selenium");
    }

}