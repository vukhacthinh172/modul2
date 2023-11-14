package bai3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,2,1,4,5,6,9,8,5,5,2,6,5,2,3,4,5,6,9,5};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            int currentElement  = arr[i];
            if (hashMap.containsKey(currentElement )){
                hashMap.put(currentElement ,hashMap.get(currentElement )+1);
            }else {
                hashMap.put(currentElement ,1);
            }
        }
//        System.out.println(hashMap);
        System.out.println("Số lần xuất hiện của mỗi phần tử:");
//        for (int i = 0; i <hashMap.size() ; i++) {
//           if (hashMap.get(i)!=null){
//               System.out.println(i + ": " + hashMap.get(i) + " lần");
//           }
//        }
        for (int key : hashMap.keySet() ){
            System.out.println(key + ": " + hashMap.get(key) + " lần");
        }
    }
}
