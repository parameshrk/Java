package JavaBasics;

import java.util.Scanner;

public class RectangleInputFromUser {

    public static void main(String[] args) {

        int length ;
        int breadth ;

        Scanner st = new Scanner(System.in); // to input data

        //import from java

        System.out.println("Enter length of rectangle");
        length = st.nextInt();

        System.out.println("Enter breadth of rectangle");
        breadth = st.nextInt();


        int area;
        int perimeter;

        area = length * breadth ;

        perimeter = 2*(length + breadth);

        System.out.println("Area="+area);
        System.out.println("Perimeter="+perimeter);

    }
}
