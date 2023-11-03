package bai2;

import javax.swing.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class
MAin {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        ArrayList<String> emails = new ArrayList<String>();
//     // lưa danh sách và in ra danh sách email
//        System.out.println("nhap so luong email can them ");
//        int email = sc.nextInt();
//        String[] arr = new String[email];
//        // them email
//        sc.nextLine();
//        for (int i = 0; i < email; i++) {
//            System.out.println("Nhập email thứ " + (i + 1) + ": ");
//            arr[i] = sc.nextLine();
//        }
//
//        //in ra email
//        System.out.println("cac email la ");
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.println(arr[i]+" ");
//        }

        while (true){
            System.out.println("Chọn tùy chọn:");
            System.out.println("1. Thêm email");
            System.out.println("2. Hiển thị danh sách email");
            System.out.println("3. xóa email");
            System.out.println("4. kiểm tra email");
            System.out.println("5. Thoát");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhập địa chỉ email cần thêm: ");
                    String email = sc.next();
                    emails.add(email);
                    System.out.println("Email đã được thêm vào danh sách ");
                    break;
                case 2:
                    System.out.println("Danh sách email: ");
                    // size() lấy kích thước của ArrayList
                    for (int i = 0; i < emails.size() ; i++) {
                        //get ()là để lấy phần tử trong arrList;
                        System.out.println( (i+1 ) +emails.get(i) +" ");
                    }
                    break;
                case 3 :
                    System.out.println("nhập thứ tự email cần xóa ");
                    int position = sc.nextInt();
                    if (position>=0&&position<emails.size()){
                        emails.remove(position);
                        System.out.println("Email đã được xóa khỏi danh sách.");
                        for (int i = 0; i < emails.size() ; i++) {
                            //get ()là để lấy phần tử trong arrList;
                            System.out.println( (i ) +emails.get(i) +" ");
                        }
                    }else {
                        System.out.println("nhập ko hợp lệ ");
                    }
                    break;
                case 4 :
                    String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
                    Pattern painter = Pattern.compile(emailRegex);
                    System.out.println("nhập thứ tự  email mà bạn muốn kiểm tra ");
                    int position1 = sc.nextInt();
                    if (position1>=0&&position1<emails.size()){
                        String checkEmail = emails.get(position1-1);
                        Matcher matcher = painter.matcher(checkEmail);
                        if (matcher.matches()){
                            System.out.println(checkEmail+" l email hợp lệ");
                        }else {
                            System.out.println(checkEmail +" là email không hợp lệ");
                        }
                    }else {
                        System.out.println("vi tri k hop le");
                    }
                    break;
                case 5 :
                    System.out.println("ket thuc chuong trinh ");
                    sc.close();
                    System.exit(0);
                default:
                    break;
            }
        }
    }
}
