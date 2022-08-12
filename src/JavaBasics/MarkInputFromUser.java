package JavaBasics;

import java.util.Scanner;

public class MarkInputFromUser {

    public static void main(String[] args) {

        int marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Mark");

        marks = sc.nextInt();


        if(marks<45)
            System.out.println("Fail");

        else if(marks>=45 && marks<50)



            System.out.println("Third Class") ;

        else if(marks>=50 && marks<60)

            System.out.println("Second Class");

        else if (marks>=60 && marks<75)

            System.out.println("First class");

        else if(marks>=75)

            System.out.println("Distinction");
    }

}
