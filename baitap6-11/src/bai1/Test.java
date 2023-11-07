package bai1;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle() ;
        Shape shape = new Shape() ;
        triangle.inputData();
        System.out.println(triangle);
        shape.inputData();
        System.out.println(shape);
    }
}
