package a;//입력된 정수값이 3으로 나누어 떨어지는지 알수 있는 프로그램

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값");

        int n = stdIn.nextInt();

        System.out.println("n=" + n);

        if ( n > 0) {
            if (n % 3 == 0)
                System.out.println(" 3으로 나누어 떨어집니다");
            else if (n % 3 == 1)
                System.out.println(" 3으로 나눌때 나머지가 1입니다");
            else if (n % 3 == 2)
                System.out.println(" 3으로 나눌때 나머지가 2입니다");
        }
        else
                System.out.println(" 음수입니다");

    }
}
