package a;//입력된 정수값이 10의 배수인지 아닌지 알수있는 프로그램

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값 :"); int n = stdIn.nextInt();

        if(n>0)
            if(n%10==0)
                System.out.println("10의 배수입니다");
            else
                System.out.println("10의 배수가 아닙니다");
        else
            System.out.println("음수입니다");

    }
}
