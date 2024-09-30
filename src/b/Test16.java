package b;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println(" 정수 a의 값을 입력하시오 : ");
        int a = stdIn.nextInt();
        System.out.println(" 정수 b의 값을 입력하시오 : ");
        int b = stdIn.nextInt();

        if (a == b)
            System.out.println(" 두 값은 같습니다");
        else {
            int max;
            int min;
            if (a > b) {
                max = a;
                min = b;
            } else {
                min = a;
                max = b;
            }

            System.out.println("최댓값은 " + max + "입니다");
            System.out.println("최솟값은 " + min + "입니다");
        }
    }
}
