package ss6bai13;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập vào 1 địa chỉ email");
        String email = sc.nextLine();
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Pattern để chuyển đổi emailRegex thành 1 đối tượng Pattern
        //matches ()  để so sánh emailRegex với email của người dùng nhập vào
        boolean checkEmail = Pattern.matches(emailRegex,email);
        if (checkEmail){
            System.out.println(email+ " là email hợp lệ ");
        }else {
            System.out.println(email+" là email ko hợp lệ ");
        }
    }
}
