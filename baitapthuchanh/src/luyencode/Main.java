package luyencode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("nhap 1 so");
            String number = sc.nextLine();
            Pattern pattern = Pattern.compile("^-?\\d+(\\.\\d+)?$");
            Matcher matcher = pattern.matcher(number);
            if (matcher.matches()){
                System.out.println("Đây là một email hợp lệ.");
                break;
            }else {
                System.out.println("Đây không phải là một email hợp lệ.");
            }
        }
    }
}
