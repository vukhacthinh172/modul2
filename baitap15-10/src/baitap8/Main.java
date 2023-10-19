package baitap8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;
        while (continueInput) {
            System.out.println("hãy nhập cạnh a");
            double a = sc.nextDouble();
            System.out.println("hãy nhập cạnh b");
            double b = sc.nextDouble();
            System.out.println("hãy nhập cạnh c");
            double c = sc.nextDouble();
            if (a < b + c && b < a + c && c < a + b) {
                double p = (a + b + c) / 2;
                double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Chu vi tam giác là :" + (a + b + c));
                System.out.println("Diện tích tam giác là :" + s);
                System.out.println("bạn có muốn tiếp tục : 1 :có / 2: không ");
                int choice = sc.nextInt();
                if (choice == 2) {
                    continueInput = false;
                } else {
                    System.out.println("Không hợp lệ . Vui lòng nhập lại");


                }
            }

        }
    }
}


