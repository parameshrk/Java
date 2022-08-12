package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertDateIntoString {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        // lets convert Date into String
        // in our desired format

        // create a new object

        SimpleDateFormat sd = new SimpleDateFormat ("dd/MM/yyyy");

        String dateStr = sd.format(date); // storing into string

        System.out.println("dateStr="+dateStr);


        SimpleDateFormat sd1 = new SimpleDateFormat ("dd-MMMM-yyyy");
        System.out.println(sd1.format(date));


        SimpleDateFormat sd2 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        System.out.println(sd2.format(date));


        SimpleDateFormat sd3 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        System.out.println(sd3.format(date));


        SimpleDateFormat sd4 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        System.out.println(sd4.format(date));


        SimpleDateFormat sd5 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        System.out.println(sd5.format(date));


        SimpleDateFormat sd6 = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sd6.format(date));


    }
}
