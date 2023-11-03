package bai3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào 1 chuỗi ");
        String chuoi = sc.nextLine();
        int max = 0 ;
        String chuoiCOnMax = "" ;
        for (int i = 0; i < chuoi.length(); i++) {
            for (int j = i + 1; j <= chuoi.length(); j++) {
                String chuoiCon = chuoi.substring(i,j);
                if (kiemTraKiTuTrungLap(chuoiCon)){
                    break;
                }else {
                    if (chuoiCon.length()>max){
                        max= chuoiCon.length();
                        chuoiCOnMax= chuoiCon ;
                    }
                }
            }
        }
        System.out.println(chuoiCOnMax);

    }

    public static boolean kiemTraKiTuTrungLap(String input) {
        for (int i = 0; i < input.length(); i++) {
            char kiTu = input.charAt(i);
            if (input.lastIndexOf(kiTu)!=i) {
                return  true ;
            }
        }
        return false;
    }
}
