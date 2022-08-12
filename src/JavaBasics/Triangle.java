package JavaBasics;

public class Triangle {

    public static void main(String[] args) {

        int a = 90;
        int b = 45;
        int c = 45;

        if(a+b+c == 180 && a>0 && b>0 && c>0) {

			/* If else if ladder → it stop checking condition once the true condition is
			   found

			  Multiple if → here all the if conditions are compulsoriely checked */


            if(a==b && b==c)
                System.out.println("Equilateral triangle");

            //else if ( (a==b && b!=c) || (b==c && c!=a) || (c==a && a!=b))

            if ( (a==b && b!=c) || (b==c && c!=a) || (c==a && a!=b))

                System.out.println("Isocelece triangle");

            //else if(a!=b && b!=c && c!=a)

            if(a!=b && b!=c && c!=a)

                System.out.println("Scalen triangle");

            //else if ( a==90 || b==90 || c==90 )

            if ( a==90 || b==90 || c==90 )

                System.out.println("Right angled triangle");
        }

        else

            System.out.println ("this is not a triangle");


    }

}
