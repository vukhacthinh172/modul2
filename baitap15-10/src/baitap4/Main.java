package baitap4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố muốn in ra");
        int number = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            boolean flag = true;
            if (n == 2) {
                System.out.println(n);
                count++;
            } else {
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    System.out.println(n);
                    count++;
                }
            }
            n++;
        }
    }
}
