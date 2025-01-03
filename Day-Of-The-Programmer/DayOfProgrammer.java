public class DayOfProgrammer {

    // 1700 - 2700 time machine
// 1700-1917 Julian calendar
// 1919 Gregorian calendar
// Julian --> Gregorian 1918        31 Jan -- Feb 14
// February is the only month
// Julian - %4: leap ---- Gregorian %400, %4, !%100


    public static String dayOfProgrammer(int year) {

        if(year == 1918){
            return "26.09." + year;
        }

        //leap
        if(year >= 1918 && (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0) ){
            return "12.09." + year;
        }
        //not leap
        else if(year >= 1918 && year % 4 != 0){
            return "13.09." + year;
        }
        //leap
        else if(year < 1918 && year % 4 == 0){
            return "12.09." + year;
        }
        //not leap
        else {
            return "13.09." + year;
        }

    }

}
