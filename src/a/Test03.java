package a;//입력된 두 정수를 나누었을때 딱 떨어지는지 알수있는 프로그램

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("변수 A :"); int a = stdIn.nextInt();
        System.out.println("변수 B :"); int b = stdIn.nextInt();

        if (a%b == 0)
            System.out.println("B는 A의 약수입니다");
        else
            System.out.println("B는 A의 약수가 아닙니다");


    }
}
