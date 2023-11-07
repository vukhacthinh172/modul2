package bai1;

import java.util.Scanner;

public class Shape extends Triangle {
    private String mauSac;

    public Shape() {
    }

    public Shape(double side1, double side2, double side3, String mauSac) {
        super(side1, side2, side3);
        this.mauSac = mauSac;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cạnh thứ 1");
        //  Triangle triangle = new Triangle();
        this.setSide1(sc.nextDouble());
        System.out.println("nhập cạnh thứ 2");
        this.setSide2(sc.nextDouble());
        System.out.println("nhập cạnh thứ 3");
        this.setSide3(sc.nextDouble());
        sc.nextLine();
        System.out.println("nhập màu sắc ");
        this.mauSac = sc.nextLine();
    }

    public String toString() {
        return "Shape{" +
                "side1=" + super.getSide1() +
                ", side2=" + super.getSide2() +
                ", side3=" + super.getSide3() +
                ", perimeter=" + getPerimeter() +
                ", area=" + super.getArea() +
                ", mauSac='" + mauSac + '\'' +
                '}';
    }
}
