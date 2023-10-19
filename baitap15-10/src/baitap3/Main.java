package baitap3;

public class Main {
    public static void main(String[] args) {
        System.out.println("cac so nguyen to nho hon 100 la:");
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            // Math.sqrt(i) để kiểm tra căn bậc 2 của i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                System.out.print(" " + i);
        }
    }
}
