package baitap7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin moi nhap lua chon cua ban");
        byte choice;
        while (true) {
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật .\n" +
                    "2. Tính chu vi và diện tích hình tam giác \n" +
                    "3.Tính chu vi và diện tích hình tròn.\n" +
                    "4. Exit\n");
            System.out.println("Hãy nhập vào lựa chọn");
            choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Tính chu vi và diện tích hình chữ nhật");
                    System.out.println("hãy nhập chiều dài");
                    int chieuDai = sc.nextInt();
                    System.out.println("hãy nhập chiều rộng");
                    int chieuRong = sc.nextInt();
                    System.out.println("chu vi hình chữ nhật là :" + (2 * chieuRong * chieuDai));
                    System.out.println("diện tích hình chữ nhật là :" + (chieuRong * chieuDai));
                    break;
                case 2:
                    System.out.println("Tính chu vi và diện tích hình tam giác ");
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
                    } else {
                        System.out.println("Không thể tạo tam giác với các giá trị a, b, c này.");
                    }
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println(" Tính chu vi và diện tích hình tròn");
                    System.out.println("hãy nhập bán kính hình tròn ");
                    int r = sc.nextInt();
                    double pi = Math.PI;
                    System.out.println("Chu vi hình tròn là :" + 2 * pi * r);
                    System.out.println("Diện tích hình tròn là :" + pi * (r * r));
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("đang thoát ....");
                    return;
                default:
                    System.out.println("ban da chon sai . vui long chon lai");
            }
        }
    }
}
