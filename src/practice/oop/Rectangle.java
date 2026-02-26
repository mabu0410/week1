package practice.oop;

public class Rectangle extends Shape{
    private double w;
    private double h;

    public Rectangle(double w, double h){
        this.w = w;
        this.h = h;
    }
    @Override
    double getArea() {
        return w*h;
    }
}
