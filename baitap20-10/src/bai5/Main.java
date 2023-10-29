package bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" nhap so hang ");
       int hang = sc.nextInt();
        System.out.print("nhap so cot ");
        int cot = sc.nextInt();
        double [][] mangSoNguyen = new double[hang][cot];
        System.out.println("Nhập giá trị cho từng phần tử của mảng: ");
        for (int i = 0; i <hang ; i++) {
            for (int j = 0; j <cot ; j++) {
                mangSoNguyen[i][j]=sc.nextDouble();
            }
        }
        double minValue = mangSoNguyen[0][0];
        int hangIndex= 0;
        int cotIndex = 0;
        //duyệt mảng tìm ra min
        for (int i = 0; i <hang ; i++) {
            for (int j = 0; j <cot ; j++) {
                if (minValue>mangSoNguyen[i][j]){
                    minValue= mangSoNguyen[i][j];
                    hangIndex= i;
                    cotIndex= j;
                }
            }
        }
        System.out.println("gia tri nho nhat trong mang la " + minValue);
        System.out.println("Tọa độ của phần tử lớn nhất là : dòng " + (hangIndex + 1) + " vị trí thứ " + (cotIndex+ 1));
    }
}
