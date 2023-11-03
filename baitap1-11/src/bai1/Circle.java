package bai1;

import java.util.Scanner;

public class Circle {
    private  double banKinh ;
    private String mauSac ;
    public  Circle(){
    }
    //khai bao doi tuong
    public  Circle(double banKinh,String mauSac){
        this.banKinh=banKinh;
        this.mauSac=mauSac;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public double chuVi(){
        return  2*Math.PI*banKinh;
    }
    public double dienTich(){
        return  2*Math.PI*banKinh*banKinh;
    }
    public void  inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh:");
        this.banKinh= Double.parseDouble(sc.nextLine());
        System.out.println("nhap mau sac:");
        this.mauSac = sc.nextLine();
    }
    public void  displayData(){
        System.out.println("thông tin cuả hình tròn :");
        System.out.println("Bán kính : " +banKinh +" | Màu sắc : "+mauSac);
    }
}
