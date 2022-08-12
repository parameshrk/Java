package JavaBasics;

public class ForLoopDivisible {

    public static void main(String[] args) {


        for (int i=1;i<=30;i++)
        {
            if( i%3 == 0 )
            {
                System.out.println(i+" Numbers divisible by 3");
            }

            if( i%5 == 0 )
            {

                System.out.println(i+" Numbers divisible by 5");
            }

            if( i%3 == 0 && i%5 == 0 )
            {

                System.out.println(i+" Numbers divisible by 3 and 5");
            }

            if( i%3 == 0 || i%5 == 0 )

                System.out.println(i+" Numbers not divisible by 3 and 5");

        }
    }
}
