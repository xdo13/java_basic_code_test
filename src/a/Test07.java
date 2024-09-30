package a;// 입력된 정수값이 5로 나누어떨어지는지 알수 있는 프로그램

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정숫값 : "); int n = stdIn.nextInt();

        if ( n > 0 )
            if( n % 5 ==0)
                System.out.println(" 5로 나누어 떨어집니다");
            else
                System.out.println("5로 나누어 떨어지지 않습니다");
        else
            System.out.println("음수입니다");
    }
}
