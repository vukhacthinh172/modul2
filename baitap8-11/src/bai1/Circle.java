package bai1;

public class Circle extends Shape implements Resizeable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        radius *= (1 + percent / 100);
    }
    public Double getArea() {
        return radius * radius * Math.PI;
    }
}
