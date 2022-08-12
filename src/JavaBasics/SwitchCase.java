package JavaBasics;

public class SwitchCase {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int a = 9;
        int b = 4;
        int c;

        String operation = "div";

        switch (operation)

		/* it just like if condition

		will directly take into condition */ {
            case "add":
                c = a + b;
                System.out.println("Addition=" + c);
                break;

            case "sub":
                c = a - b;
                System.out.println("Subraction=" + c);
                break;

            case "mul":
                c = a * b;
                System.out.println("Multiplication=" + c);
                break;

            case "div":
                c = a / b;
                System.out.println("Division=" + c);
                break;

        }

    }
}