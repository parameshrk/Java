package String;

public class StringHomeWork3 {

    public static void main(String[] args) {

        String str = "This is completely his decision";

        String[] stArr = str.split(" ");

        for (int i=0;i<stArr.length;i++)
        {
            if(stArr[i].contains("is"))
                System.out.println(stArr[i]);
        }
    }
}
