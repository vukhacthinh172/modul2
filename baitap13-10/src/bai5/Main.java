package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin moi nhap chieu dai");
        float chieuDai = sc.nextFloat();
        System.out.println("xin moi nhap chieu rong");
        float chieuRong = sc.nextFloat();
        float chuVi = chieuDai*chieuRong*2;
        System.out.println("chu vi hinh vuong la"+chuVi);
        float dienTich = chieuDai*chieuRong;
        System.out.println("dien tich hinh vuong la"+dienTich);
    }
}
