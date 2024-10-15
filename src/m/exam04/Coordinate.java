package m.exam04;

public class Coordinate {
    private double x;
    private double y;

    Coordinate(double x, double y) {this.x = x; this.y = y;}

    double getX() { return x;}
    double getY() { return y;}

    void setX(double x){this.x = x;}
    void setY(double y){this.y = y;}

    void set(double x, double y) {this.x=x; this.y = y;}
}
