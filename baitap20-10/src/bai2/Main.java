package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong cua mang ");
        int number = sc.nextInt();
        int[] mangSoNguyen = new  int[number];
        System.out.println("cac phan tu cua mang la ");
        for (int i = 0; i <number ; i++) {
            mangSoNguyen[i]= sc.nextInt();
        }
        System.out.println("in ra cac phan tu cua mang"+ Arrays.toString(mangSoNguyen));
        System.out.println("nhap gia tri can chen ");
        int x = sc.nextInt();
        int index ;
        while (true){
            System.out.println("nhap vi tri muon chen ");
            index = sc.nextInt();
            if (index >= 0 && index <= number){
               //dk dung
                break;
            }else {
                System.out.println("ban da nhap sai vui long nhap lai ");
            }
        }
        int[] newArr= new int[number+1];
        for (int i = 0; i <index ; i++) {
            newArr[i]= mangSoNguyen[i];
            // mang newArr[i]= [1,2]
        }

        for (int i = index; i <number ; i++) {
            newArr[i+1]= mangSoNguyen[i];
        }
        System.out.println("Mảng sau khi chèn: " + Arrays.toString(newArr));
    }
}
