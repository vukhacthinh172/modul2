package bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // nhap so hang
        System.out.print("xin moi nhap so hang ");
        int soHang = sc.nextInt();
        // nhap so cot
        System.out.print("nhap so cot ");
        int soCot = sc.nextInt();
        System.out.println("Nhập giá trị cho từng phần tử của mảng:");
        //khai bao mang
        double[][] mangHaiChieu = new double[soHang][soCot];
        //gan phan tu cho so hang va so cot
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                mangHaiChieu[i][j] = sc.nextDouble();
            }
        }
        //in ra 2 mảng vừa tạo
        System.out.println("2 mang vua duoc tao la ");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(mangHaiChieu[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("nhap cot muon tinh tong ");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 0; i < soHang; i++) {
            sum+= mangHaiChieu[i][n-1];
        }
        System.out.println( " tổng của số cột muốn tính là: "+sum);
    }
}
