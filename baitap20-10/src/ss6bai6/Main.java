package ss6bai6;

public class Main {
    public static void main(String[] args) {
        StringBuilder chuoi = new StringBuilder("hello word");
        chuoi.insert(6,",") ;
        String chuoiMoi = chuoi.toString();
        System.out.println(chuoiMoi);
    }
}
