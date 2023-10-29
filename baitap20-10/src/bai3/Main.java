package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap kich thuosc mang thu nhat: ");
        int kichThuocMang1 = sc.nextInt();
        int[] arr1 = new int[kichThuocMang1];
        System.out.println("nhap kich thuosc mang thu 2: ");
        int kichThuocMang2 = sc.nextInt();
        int[] arr2 = new int[kichThuocMang2];
        //mang thu 3
        int[] arr3 = new int[kichThuocMang1+ kichThuocMang2 ];
        // gan gia tri cho tung mang
        System.out.println("gan gia tri cho mang 1 ");
        for (int i = 0; i <kichThuocMang1 ; i++) {
            arr1[i]= sc.nextInt();
        }
        System.out.println("gan gia tri cho mang 2 ");
        for (int i = 0; i <kichThuocMang2 ; i++) {
            arr2[i]= sc.nextInt();
        }
        //gan gia tri mang 1 vao mang 3
        for (int i = 0; i <kichThuocMang1 ; i++) {
            arr3[i]= arr1[i];
        }
        // gan gia tri mang 2 vao mang 3
        for (int i = 0; i <kichThuocMang2 ; i++) {
            arr3[kichThuocMang1+i]= arr2[i] ;
        }
        //in ra mang 3
        System.out.println("mang 3 co ca gia tri la: ");
        for (int i = 0; i <arr3.length ; i++) {
            System.out.print(arr3[i]+" ");
        }
    }
}