package ss6bai8;

public class Main {
    public static void main(String[] args) {
        StringBuffer chuoi = new StringBuffer("hello");
        System.out.println("chuoi truoc khi duoc thay the la: "+ chuoi);
        chuoi.replace(0,5,"hi");
        String chuoiMoi = chuoi.toString();
        System.out.println("chuoi sau khi duoc thay the la: "+chuoiMoi);
    }
}
