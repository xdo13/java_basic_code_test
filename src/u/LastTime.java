package u;


import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


class LastTime {
    static void init(){
        BufferedReader br = null;

        try{
            br = new BufferedReader(new FileReader("LastTime.txt"));
                    String time = br.readLine();
            System.out.println("이전 시간은 " + time + "였습니다");
        }catch (IOException e){
            System.out.println(" 이 프로그램을 실행하는 것은 처음입니다.");
        }finally {
            if (br != null){
                try {
                    br.close();
                }catch (IOException e){
                    System.out.println("파일 닫기 실패");
                }
            }
        }
    }

    static void term(){
        FileWriter fw = null;
        try {
            fw = new FileWriter("LastTime.txt");
            GregorianCalendar c = new GregorianCalendar();
            fw.write((String.format("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초", c.get(Calendar.YEAR), c.get(Calendar.MONTH)+1,c.get(Calendar.DATE),
                    c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND))));
        }catch (IOException e){
            System.out.println("오류 발생");
        }finally {

            if (fw != null){
                try{
                    fw.close();
                }catch (IOException e){
                    System.out.println("파일 닫기 실패");
                }
            }
        }
    }

    public static void main(String[] args) {
        init();
        term();
    }
}
