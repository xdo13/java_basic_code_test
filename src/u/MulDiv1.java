package u;

import java.util.Scanner;

class MulDiv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값: "); int x = scanner.nextInt();
        System.out.print("y값: "); int y = scanner.nextInt();

        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
    }
}
