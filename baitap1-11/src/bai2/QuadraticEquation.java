package bai2;

import java.util.Scanner;

public class QuadraticEquation {
    private  double a ;
    private  double b ;
    private  double c ;
    public QuadraticEquation(){
    }
    public QuadraticEquation(double a,double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        return b*b-4*a*c ;
    }
    public double getRoot1(){
        double delta = getDiscriminant();
        if (delta>=0){
            return (-b + Math.sqrt(delta)) / (2 * a);
        }else {
            return 0 ;
        }
    }
    public double getRoot2(){
        double delta = getDiscriminant();
        if (delta>=0){
            return (-b - Math.sqrt(delta)) / (2 * a);
        }else {
            return 0 ;
        }
    }
    public void  inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
        this.a = sc.nextDouble();
        System.out.println("nhap so b");
        this.b = sc.nextDouble();
        System.out.println("nhap so c");
        this.c = sc.nextDouble();
    }
}
