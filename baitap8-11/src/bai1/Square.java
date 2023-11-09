package bai1;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }
    public  void resize(double percent){
        super.resize(percent);
    }
    public  Double getArea() {
     return super.getArea();
    }
}
