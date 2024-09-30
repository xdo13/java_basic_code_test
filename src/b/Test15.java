package b;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println(" 정수 A를 입력하시오 : "); int a = stdIn.nextInt();
        System.out.println(" 정수 B를 입력하시오 : "); int b = stdIn.nextInt();
        System.out.println(" 정수 C를 입력하시오 : "); int c = stdIn.nextInt();

        int med;

        if( a>=b)
            if(b>=c)
                med = b;
            else if (a <=c)
                med = a;
            else
                med = c;
        else if (a > c)
            med = a;
        else if ( b> c)
            med =c;
        else
            med = b;

        System.out.println("중앙 값은 " + med + "입니다");
    }
}
