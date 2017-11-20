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
    public boolean isFlag(Point p){
        if (Math.sqrt(this.point.getX()-p.getX())+Math.sqrt(this.point.getY()-p.getY())<=Math.pow(r,2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Point p = new Point(5,5);
        Circle c = new Circle(5,p);
        System.out.println(c.isFlag(new Point(6,6))?"在圆内":"不在圆内");
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