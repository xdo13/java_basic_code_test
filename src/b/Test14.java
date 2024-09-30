package b;

import java.util.Scanner;

public class Test14 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println(" 정수 a의 값을 입력하시오 : "); int a = stdIn.nextInt();
        System.out.println(" 정수 b의 값을 입력하시오 : "); int b = stdIn.nextInt();
        System.out.println(" 정수 c의 값을 입력하시오 : "); int c = stdIn.nextInt();

        int min = a;
        if(b < min)
            min = b;
        if(c< min)
            min = c;

        System.out.println("최솟값은 " + min +"입니다");


    }

}
