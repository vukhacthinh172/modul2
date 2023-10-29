package bai4;

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
        // tìm giá trị lớn nhất
        double giaTriMax = mangHaiChieu[0][0];
        int maxHang = 0;
        int maxCot = 0;
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                if (giaTriMax < mangHaiChieu[i][j]) {
                    giaTriMax = mangHaiChieu[i][j];
                    maxHang = i;
                    maxCot = j;
                }
            }
        }
        System.out.println("gia tri lon nhat trong mang la " + giaTriMax);
        System.out.println("Tọa độ của phần tử lớn nhất là : dòng " + (maxHang + 1) + " vị trí thứ " + (maxCot + 1));
    }
}
