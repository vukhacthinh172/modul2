package bai2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so luong tu ");
        int soLuong = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <soLuong ; i++) {
            System.out.println("nhap tu thu "+(i+1));
            String word = sc.nextLine();
            stack.push(word);

        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
}
