package baitap2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. In hình chữ nhật (Rectangle)\n" +
                    "2. In hình tam giác vuông góc vuông ở 4 góc khác nhau: \n" +
                    "3. In hình tam giác cân ( Isosceles triangle)\n" +
                    "4. Exit\n");
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị hình chữ nhật
                    sc.nextLine();
                    System.out.println("nhap chiu dai");
                    double width = sc.nextDouble();
                    System.out.println("nhap chieu rong");
                    double lenght = sc.nextDouble();
                    for (double i = 0; i < width; i++) {
                        for (double j = 0; j < lenght; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    // hiển thị tam giác vuông theo menu
                    System.out.println("a. Trên cùng bên trái (top-left) \n" +
                            "b. Trên cùng bên phải( top-right)\n" +
                            "c. Dưoi cùng bên trái( bottom-left) \n" +
                            "d. Dưới cùng bên phải(bottom-right)\n");
                    System.out.println("nhập lựa chọn của bạn");
                    String next = sc.nextLine();
                    switch (next) {
                        case "a":
                            sc.nextLine();
                            for (int i = 7; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case "b":
                            sc.nextLine();
                            int n = 7;
                            for (int i = 0; i < n; i++) {
                                for (int k = 0; k <= i; k++) {
                                    System.out.print(" ");
                                }
                                for (int j = 0; j < n - i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case "c":
                            sc.nextLine();
                            System.out.println("nhap chieu dai");
                            int canhHuyen1 = sc.nextInt();
                            System.out.println("nhap chieu rong");
                            int canhKe1 = sc.nextInt();
                            for (int i = 1; i <= canhHuyen1; i++) {
                                for (int j = 1; j < i; j++) {
                                    System.out.print(" * ");
                                }
                                System.out.println();
                            }
                            break;
                        case "d":
                            sc.nextLine();
                            int m = 7;
                            for (int i = 0; i < m; i++) {
                                for (int j = 0; j < m - i; j++) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("nhập lại");

                    }
                    break;
                case 3:
                    sc.nextLine();
                    int a = 5;
                    for (int i = 0; i <= a; i++) {
                        for (int j = 0; j < a - i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <= 2 * i; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
//                    System.exit(0);
                    System.out.println("thoát chương trình");
                    break;
                default:
                    System.out.println("nhập không hợp lệ");
            }

            if (choice == 4) {
                break;
            }
        }
        // nothing
    }
}

