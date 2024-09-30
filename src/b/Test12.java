package b;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정수 a의 값을 적으시오 : ");int a = stdIn.nextInt();
        System.out.println("정수 b의 값을 적으시오 : ");int b = stdIn.nextInt();

        int diff;

        if(a>b)
            diff = a - b;
        else
            diff = b - a;
        System.out.println("두 정수의 차는 " + diff + "입니다");

    }
}
