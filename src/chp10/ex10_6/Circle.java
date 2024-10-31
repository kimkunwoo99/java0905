package chp10.ex10_6;

public class Circle extends Shape{
    private int radius;

    @Override
    double area() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
