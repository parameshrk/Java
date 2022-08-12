package StaticAndFinal;

public class FinalVariable {
    final int speed = 200;

    void change()
    {
        // speed = 300;
    }

    public static void main(String[] args) {

        FinalVariable ob = new FinalVariable();

        ob.change();

        System.out.println(ob.speed);
    }
}
