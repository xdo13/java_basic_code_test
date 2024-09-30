package a;// 입력된 정수값의 절댓값을 구하는 프로그램

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값");
        int n = stdIn.nextInt();

        if(n>=0)
            System.out.println("절댓값은 "+ n +"입니다");
        else
            System.out.println("절댓값은 "+ -n + "입니다");

    }
}
