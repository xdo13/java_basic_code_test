package u;

import java.util.Scanner;

class ThrowAndCatch {
    static void check(int sw) throws Exception {
        switch (sw) {
            case 1:
                throw new Exception("검사 예외 발생!!");
            case 2:
                throw new RuntimeException("비검사 예외 발생!!");
        }
    }

    static void test(int sw) throws Exception {
        check(sw);   //이 호출은 검사 예외가 발생할 수 있음
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sw: ");
        int sw = scanner.nextInt();
        try {
            test(sw);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}