package p.exam02;

import java.util.Calendar;
import  java.util.GregorianCalendar;

public class DateId {
    private static int counter;
    private int id;

    static {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(Calendar.YEAR);
        int m = today.get(Calendar.MONTH) + 1;
        int d = today.get(Calendar.DATE);

        System.out.printf("오늘은 %04d년 %02d월 %02d일입니다. \n", y, m, d);

        counter = y * 1000000 + m * 10000+ d *100;
    }

    public DateId(){
        id = ++counter;
    }
    public int getId(){
        return id;
    }
}
