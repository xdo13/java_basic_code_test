package a;// 입력된 정수값이 음수인지 판별하는 프로그램

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값:");
        int n = stdIn.nextInt();

        if(n<0)
            System.out.println("음수입니다");


    }
}
