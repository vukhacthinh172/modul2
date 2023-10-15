package bai2;

import java.util.Scanner;

public class Main {
   static double usdAmount = 23000;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap so tien");
        double vnd= sc.nextDouble();
        double vndAmount = vnd * usdAmount ;
        System.out.println("so tin chuyen doi la"+vndAmount+"VND");
    }
}
