package bai9;

public class Main {
    public static void main(String[] args) {
        int[] mangSoNguyen = {1,2,7,6,5};
        int max=0;
        int max2 = 0 ;
        for (int i = 0; i <mangSoNguyen.length ; i++) {
            if (max<mangSoNguyen[i]){
                max= mangSoNguyen[i];
            } else if (mangSoNguyen[i] > max2 && mangSoNguyen[i] != max) {
                max2 = mangSoNguyen[i];
            }
        }
        System.out.println("số lớn thứ 2 là "+max2);
    }
}
