package bai5;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str1 = " Able was I ere I saw Elba";
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println("Is \"" + str1 + "\" a palindrome? " + palindromeChecker.isPalindrome(str1));
    }
    public static class PalindromeChecker{
        protected  boolean isPalindrome(String str){
            // chuyen thanh chu thuong va loai bo khoang trang
            String clear = str.toLowerCase().replaceAll("\\s", "");
            Queue<Character> queue = new LinkedList<>();
            for (char s : clear.toCharArray()){
                queue.offer(s);
            }
            // tao 1 stack
            Stack<Character> stack = new Stack<>();
            while (!stack.isEmpty()){
                stack.push(queue.poll());
            }
            while (!queue.isEmpty()&&!stack.isEmpty()){
                // vi tri dau cua queue va vi tri cuoi cua stack so sanh voi nhau
                if (queue.poll()!=stack.pop()){
                    return false;
                }
            }
            return true ;
        }
    }
}

