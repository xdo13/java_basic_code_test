package m.exam05;

import java.util.Scanner;

public class CoordinateTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);  // 스캐너 객체 생성

        System.out.println("좌표 p를 입력하세요");
        System.out.print("X좌표: ");
        double x = stdIn.nextDouble();  // 사용자로부터 X좌표 입력 받기
        System.out.print("Y좌표: ");
        double y = stdIn.nextDouble();  // 사용자로부터 Y좌표 입력 받기

        Coordinate p = new Coordinate(x, y);  // 입력받은 좌표로 Coordinate 객체 p 생성
        System.out.println("p = " + p);
        Coordinate q = new Coordinate(p);  // p의 값을 복사하여 Coordinate 객체 q 생성

        System.out.println("q와 p를 동일 좌표로 만들었습니다.");
        System.out.println("q= " + q);

        // p와 q가 같은지 비교
        if (p.equalTo(q))
            System.out.println("p와 q가 같습니다");
        else
            System.out.println("p와 q가 다릅니다");

        Coordinate c1 = new Coordinate();  // 기본 생성자로 Coordinate 객체 c1 생성
        Coordinate c2 = new Coordinate(1.1, 2.2);  // 좌표 (1.1, 2.2)로 Coordinate 객체 c2 생성

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        Coordinate[] a = new Coordinate[3];  // Coordinate 객체 배열 a 생성
        for (int i = 0; i < a.length; i++)
            a[i] = new Coordinate();  // 배열의 각 요소에 기본 생성자로 Coordinate 객체 생성

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "]=" + a[i]);  // 배열의 각 요소 좌표 출력
    }
}
