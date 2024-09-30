package b;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a는 : ");int a = stdIn.nextInt();
        System.out.println("정수 b는 : ");int b = stdIn.nextInt();

        int diff;

        //int diff = a>=b ? a-b : b - a;       연산자 사용

        if(a>b)
            diff = a - b;
        else
            diff = b - a;

        if (diff >= 10)
            System.out.println(" 두 값의 차이는 10 이상입니다");
        else
            System.out.println(" 두 값의 차이는 10 미만입니다");


    }
}
