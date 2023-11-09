package bai4;

import java.util.Scanner;

public abstract class Shape {
    String color ;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double getArea() ;
    public  void  inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập màu sắc: ");
        this.color = sc.nextLine();

    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
