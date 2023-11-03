package bai4;

public class Fan {
    private int SLOW =1 ;
    private int  MEDIUM =2 ;
    private int  FAST =3 ;

    private int speed;
    private boolean on;
    private double radius;
    private String color;
    public Fan(){
        speed= SLOW;
        on = false;
        radius=5;
        color= "blue";
    }

    public int getSLOW() {
        return SLOW;
    }

    public void setSLOW(int SLOW) {
        this.SLOW = SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(int MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public void setFAST(int FAST) {
        this.FAST = FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public  String toString(){
        if (on){
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + " - Fan is on";
        }else {
            return "Speed: " + speed + ", Color: " + color + ", Radius: " + radius + " - Fan is off";
        }
    }

}
