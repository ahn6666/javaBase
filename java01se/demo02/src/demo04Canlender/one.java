package demo04Canlender;

import java.util.Calendar;

public class one {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();//多态
        System.out.println(calendar);
        calendar.add(Calendar.YEAR,30);
        int year=calendar.get(Calendar.YEAR);
        System.out.println(year);//2050

        int date = calendar.get(Calendar.DATE);
        System.out.println(date);//10
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);//10
        int day1=calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(day1);//2
        int day2=calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);
        System.out.println(day2);//2
        int day3=calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(day3);//283

        calendar.set(Calendar.YEAR,3);
        int years = calendar.get(Calendar.YEAR);
        System.out.println(years);//3

    }
}
