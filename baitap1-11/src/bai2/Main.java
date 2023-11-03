package bai2;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation= new QuadraticEquation();
        quadraticEquation.inputData();
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("phuon trinh co 2 nghiem la :");
            System.out.println(quadraticEquation.getRoot1()+" ");
            System.out.println(quadraticEquation.getRoot2()+" ");
        } else if (quadraticEquation.getDiscriminant()==0) {
            System.out.println("phuong trinh chi co 1 nghiem la: "+quadraticEquation.getRoot1());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
