package p;

import java.util.Scanner;
import static java.lang.Math.*;
import static java.lang.System.in;  //System in을 안쓰고 in만 쓸수 있음
import static java.lang.System.out; // System out 안쓰고 out만 쓸수 있음


public class MathMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("실  수: ");
        double x = scanner.nextDouble();

        System.out.println("절댓값:" + abs(x));
        System.out.println("제곱근:" + sqrt(x));
        System.out.println("넓이:" + PI*x*x);
    }
}
