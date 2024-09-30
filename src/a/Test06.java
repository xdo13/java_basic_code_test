package a;// 입력된 두 정수를 비교하여 무엇이 더 큰지 알아내는 프로그램

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("변수 A :"); int a = stdIn.nextInt();
        System.out.println("변수 B :"); int b = stdIn.nextInt();

        if(a>b)
            System.out.println("A가 크다");
        else if(a<b)
            System.out.println("B가 크다");
        else
            System.out.println("A와 B가 같다");
    }
}
