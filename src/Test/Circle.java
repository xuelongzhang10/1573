package Test;

public class Circle {
    private int r;
    private Point point;

    public Circle() {
    }

    public Circle(int r, Point point) {
        this.r = r;
        this.point = point;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    public double area(){
        return Math.PI*Math.pow(r,2);
    }
}

class Point{
    private int x;
    private int y;

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}