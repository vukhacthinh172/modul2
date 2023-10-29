package bai8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dayLaChuoi = "Process finished with exit code 0";
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập kí tự ");
        int kyTu = sc.next().charAt(0);
       int  count = 0;
        for (int i = 0; i <dayLaChuoi.length() ; i++) {
            if (dayLaChuoi.charAt(i)==kyTu){
                count++;
            }
        }
        System.out.println("Số lần ký tự xuất hiện trong chuỗi là " + count+ " lần.");
    }
}
