package bai2;

public class Square extends Shape implements Colorable  {
    private  double side ;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
//  public  double  getArea() {
//        return side*side ;
//  }

    @Override
    public  Double dienTich() {
        return side*side;
    }

    @Override
    public String howToColor() {
        return "\" Color all four sides..\\n\"" ;
    }
}
