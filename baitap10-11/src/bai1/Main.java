package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrList = generateRandomIntegerList(10) ;
        System.out.println(arrList);
        Integer maxElement = Collections.max(arrList);
        System.out.println("phan tu lon nhat la: "+maxElement);
    }
    private static  List<Integer> generateRandomIntegerList(int size){
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <size ; i++) {
            randomList.add(random.nextInt(100));
        }
        return randomList;
    }
}
