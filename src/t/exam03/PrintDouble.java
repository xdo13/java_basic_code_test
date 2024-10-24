package t.exam03;

import java.util.Scanner;

class PrintDouble {
    static void printDouble(double x, int p, int w){
        System.out.printf(String.format("%%%d.%df", w, p), x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("실수 값: ");
        double x = scanner.nextDouble();

        System.out.print("전체 자릿수:");
        int w = scanner.nextInt();

        System.out.print("소수점 이하 자릿수:");
        int p = scanner.nextInt();

        printDouble(x, p, w);
        System.out.println();
    }
}
