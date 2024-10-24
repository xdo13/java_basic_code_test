package t.exam03;

import java.util.Scanner;

class StringCompareTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열 s1:"); String s1 = scanner.next();
        System.out.print("문자열 s2:"); String s2 = scanner.next();

        int balance = s1.compareTo(s2);
        if(balance < 0)
            System.out.println("s1이 작다");
        else if (balance > 0)
            System.out.println("s2가 작다");
        else
            System.out.println("s1과 s2가 같다");


    }
}
