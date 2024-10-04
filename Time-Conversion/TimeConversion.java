import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String AM = "AM";
        String PM = "PM";

        //PM
        if(s.substring(8).equalsIgnoreCase(PM) && Integer.valueOf(s.substring(0,2)) < 12 ) {
            Integer newHourPM = Integer.valueOf(s.substring(0,2)) + 12;
            String newTimePM = newHourPM.toString() + s.substring(2,8);
            return newTimePM;
        }
        else if(s.substring(8).equalsIgnoreCase(PM) && Integer.valueOf(s.substring(0,2)).equals(12) ) {
            return s.substring(0,8);
        }
        //AM AND LESS THAN 12
        else if(s.substring(8).equalsIgnoreCase(AM) && Integer.valueOf(s.substring(0,2)) < 12) {
            return s.substring(0,8);

        }
        //AM AND HIGHER THAN 12
        else if(s.substring(8).equalsIgnoreCase(AM) && Integer.valueOf(s.substring(0,2)).equals(12)) {
            String newHourAM = "00";
            String newTimeAM = newHourAM + s.substring(2,8);
            return newTimeAM;
        }
        else{
            return s.substring(0,8);
        }

    }

}

class SolutionTimeConversion {
    public static void main(String[] args) throws IOException {
        String a = "07:05:45PM";
        String b = "12:05:45AM";
        String c = "12:05:45PM";
        String d = "05:05:45AM";
        System.out.println(TimeConversion.timeConversion(a));
        System.out.println(TimeConversion.timeConversion(b));
        System.out.println(TimeConversion.timeConversion(c));
        System.out.println(TimeConversion.timeConversion(d));

    }
}
