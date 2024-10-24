package t.exam02;

import java.util.Scanner;

class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s1: "); String s1 = scanner.next();
        System.out.print("문자열 s2: "); String s2 = scanner.next();

        int idx = s1.indexOf(s2);
        if (idx == -1)
            System.out.println("s1 안에 s2가 포함되어있지 않습니다.");
        else{
            System.out.println(s1);
            for (int i =0; i< idx; i++)
                System.out.print(' ');
                System.out.println(s2);
        }

    }
}
