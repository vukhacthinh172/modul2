package bai2;
public class Main {
    public static void main(String[] args) {
       Shape[]shapes= new Shape[3] ;
         shapes[0]= new Square(5) ;
         shapes[1]= new Circle(4) ;
        for (Shape shape : shapes) {
            System.out.println(shape.dienTich());
            if (shape instanceof Square) {
                      Square colorable = (Square) shape ;
                System.out.println(colorable.howToColor());
            }
        }

    }

}
