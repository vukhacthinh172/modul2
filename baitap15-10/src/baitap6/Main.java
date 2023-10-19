package baitap6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("xin moi nhap lua chon cua ban");
        byte choice;
        while (true) {
            System.out.println("1. Kiểm tra tính chẵn lẻ của 1 số.\n" +
                    "2. Kiểm tra số nguyên tố. \n" +
                    "3. Kiểm tra một số có chia hết cho 3 không\n" +
                    "4. Exit\n");
            System.out.println("Hãy nhập vào lựa chọn");
            choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Kiểm tra tính chẵn lẻ của 1 số");
                    System.out.println("hay nhap vao 1 so");
                    int a = sc.nextInt();
                    if (a > 1 && a % 2 == 0) {
                        System.out.println(a + "la so chan");
                    } else {
                        System.out.println(a + "la so le");
                    }
                    sc.nextLine();
                    break;
                case 2:
                    System.out.println("Kiểm tra số nguyên tố. ");
                    System.out.println("nhap vao 1 so");
                    int b = sc.nextInt();
                    boolean flag = true;
                    if (b > 1) {
                        for (int i = 2; i <= Math.sqrt(b); i++) {
                            if (b % i == 0) {
                                flag = false;
                                break;
                            }
                        }
                        if (flag == true) {
                            System.out.println(b + " la so nguyen to");
                        } else {
                            System.out.println(b + " ko la so nguyen to");
                        }
                    } else {
                        System.out.println(b + " ko la so nguyen to");
                    }

                    sc.nextLine();
                    break;
                case 3:
                    System.out.println(" Kiểm tra một số có chia hết cho 3 không");
                    System.out.println("hãy nhập 1 số ");
                    int c = sc.nextInt();
                    if (c % 3 == 0) {
                        System.out.println("số này chia hết cho 3");
                    } else {
                        System.out.println("số này ko chia hết cho 3");
                    }
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
