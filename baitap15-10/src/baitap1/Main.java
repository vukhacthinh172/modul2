package baitap1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dau tien");
        float firstNumber = sc.nextFloat();
        System.out.println("nhap so cuoi");
        float lastNumber = sc.nextFloat();
        int sum = 0;
        for (float i = firstNumber; i <= lastNumber; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("tong cac so chan la" + sum);
    }
}
