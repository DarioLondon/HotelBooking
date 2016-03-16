import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Created by Dario on 07/03/2016.
 */
public class CalendarSystem {

    Calendar calendar =new GregorianCalendar();



    String[] months = {
            "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"
    };
    String[] day_of_the_week = {
            "Sun", "Mon", "Tue", "Wen", "Thu", "Fri", "Sat"
    };
    int[] last_day_month = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };



    public int getmonth(){
        return last_day_month[calendar.get(Calendar.MONTH)];
    }






    public String[] getDayinMonth(){
        String[] days=new String[getmonth()];

        for(int day=0;day<days.length;day++){
            days[day]=String.valueOf(day+1);
        }

        return days;
    }

    public boolean isLeapYear(int year) {

        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }


     }








