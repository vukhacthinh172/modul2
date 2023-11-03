package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 chuoi");
        String chuoi = sc.nextLine();
        StringBuilder str = new StringBuilder(chuoi).reverse();
        System.out.println(str);
    }
}
