package bai1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        circle.displayData();
        System.out.println("chu vi hinh tron la "+circle.chuVi());
        System.out.println("dien tich hinh tron la "+circle.dienTich());
    }
}
