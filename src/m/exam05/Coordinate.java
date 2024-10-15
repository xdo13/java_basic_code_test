package m.exam05;

public class Coordinate {
    private double x = 0.0;  // X좌표
    private double y = 0.0;  // Y좌표

    public Coordinate() { }  // 기본 생성자

    public Coordinate(double x, double y) {
        set(x, y);  // 주어진 X, Y 좌표로 설정
    }

    public Coordinate(Coordinate c) {
        this(c.x, c.y);  // 다른 Coordinate 객체 c의 값을 복사하여 생성
    }

    public double getX() {
        return x;  // X좌표 반환
    }

    public double getY() {
        return y;  // Y좌표 반환
    }

    public void setX(double x) {
        this.x = x;  // X좌표 설정
    }

    public void setY(double y) {
        this.y = y;  // Y좌표 설정
    }

    public void set(double x, double y) {
        this.x = x;
        this.y = y;  // 주어진 X, Y 좌표로 설정
    }

    public boolean equalTo(Coordinate c) {
        return x == c.x && y == c.y;  // 두 좌표가 같은지 비교
    }

    public String toString() {
        return "(" + x + ", " + y + ")";  // 좌표를 문자열 형식으로 반환
    }
}
