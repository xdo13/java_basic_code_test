package a;// 입력된 정수값에 따른 성적 매기기

import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값 ");
        int n = stdIn.nextInt();

        if (n >= 0 && n <= 49)
            System.out.println("가");
        else if(n>49 && n<=59 )
            System.out.println("양");
        else if (n >59 && n <= 69)
            System.out.println("미");
        else if ( n > 69 && n <= 79)
            System.out.println("우");
        else if (n>79 && n <=100)
            System.out.println("수");
        else
            System.out.println(" 잘못된 입력입니다");

    }
}
