package bai4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2) ;
        Rectangle rectangle = new Rectangle(4,5);
        circle.inputData();
        rectangle.inputData();
        System.out.println(circle);
        System.out.println(rectangle);
    }
}
