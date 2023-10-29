package bai7;

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
       //tạo hình vuông
        if (soHang==soCot&&soHang>1&&soCot>1){
            //khai bao mang
            double[][] mangHaiChieu = new double[soHang][soCot];
            System.out.println("Nhập giá trị cho từng phần tử của mảng:");
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
          // tính tổng
            float sum = 0;
            for (int i = 0; i <soHang ; i++) {
                sum += mangHaiChieu[i][i];
            }
            System.out.println(" tổng các số ở đường chéo chính của ma trận vuông là: "+sum);
        }else {
            System.out.println("bạn nhập k hợp lệ ");
        }
    }
}
