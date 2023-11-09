package bai1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes= new Shape[3];
       shapes[0]=  new  Rectangle(1,2);
        shapes[1] = new Circle(4);
      shapes[2] = new Square(7);
      for (Shape shape : shapes){
      Double dienTichTruocThayDoi = shape.getArea();
          System.out.println("dien tich truoc thay doi la "+dienTichTruocThayDoi);
          double percent = random.nextInt(100) + 1;
          shape.resize(percent);
          Double newArea = shape.getArea();
          System.out.println("Diện tích sau khi thay đổi: " + newArea);
      }
    }
}
