package bai7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mot so");
        int number = sc.nextInt();
        String word= "";
        if(number<0&&number>9){
            System.out.println("Số không hợp lệ");
        } else {
            switch (number){
                case 1:
                    word = "mot" ;
                    break;
                case 2 :
                    word = "hai";
                    break;
                case 3 :
                    word = "ba";
                    break;
                case 4 :
                    word = "bon";
                    break;
                case 5 :
                    word = "nam";
                    break;
                case 6 :
                    word = "sau";
                    break;
                case 7 :
                    word = "bay";
                    break;
                case 8 :
                    word = "tam";
                    break;
                case 9 :
                    word = "chin";
                    break;
            }
        }
        System.out.println(word);
    }
}
