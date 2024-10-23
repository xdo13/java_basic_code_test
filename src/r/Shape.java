package r;

public abstract class Shape {
    public abstract String toString();

    public abstract void draw();

    public void print() {
        System.out.println(toString());
        draw();
    }

    public class Point extends Shape {
        public Point() {
        }

        public String toString() {
            return "Point";
        }

        public void draw() {
            System.out.println('+');
        }

    }


}
