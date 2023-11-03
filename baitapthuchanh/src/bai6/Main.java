package bai6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,6,7,8};
        int[] arr2= {2,5,7};
        int[] arr3= new  int[arr1.length+arr2.length];
        System.arraycopy(arr1,0,arr3,0,arr1.length);
        System.arraycopy(arr2,0,arr3,arr1.length,arr2.length);
       Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
