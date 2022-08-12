package String;

public class StringHomeWork2 {

    public static void main(String[] args) {

        String str = "We want to go to Toronto";

        // print only the words that ends with 'o'

        String[] stArr = str.split(" ");

        for (int i=0;i<stArr.length;i++)
        {
            if(stArr[i].endsWith("o"))
                System.out.println(stArr[i]);
        }

    }
}
