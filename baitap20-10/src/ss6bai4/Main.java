package ss6bai4;

public class Main {
    public static void main(String[] args) {
        String chuoi= "hello word";
        String[] arr = chuoi.split(" ");
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
}
