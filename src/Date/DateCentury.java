package Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCentury {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat ("yyyy");

        String currentYear = sd.format(date);

        System.out.println("CurrentYear="+currentYear);

        String century = currentYear.substring(0,2);

        System.out.println("century="+(Integer.parseInt(century)+1));// to convert into integer > Integer.parseInt

    }
}
