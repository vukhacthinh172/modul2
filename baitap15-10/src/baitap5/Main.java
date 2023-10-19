package baitap5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("số nhỏ nhất chia hết cho 5,7,11 là :");
        int number = 1;
        while (!(number % 5 == 0 && number % 7 == 0 && number % 11 == 0)) {
            number++;
        }
        System.out.println("" + number);
    }
}
