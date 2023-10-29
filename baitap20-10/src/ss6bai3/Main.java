package ss6bai3;

public class Main {
    public static void main(String[] args) {
        // dao nguoc chuoi
        StringBuffer arr = new StringBuffer("HelloWord");
        // them chuoi: append()
        //chen chuoi :arr.insert(5, "Java"): Chèn chuỗi "Java" vào vị trí thứ 5 trong `StringBuffer`
        //xoa : delete()
        //thay the : arr.replace(0, 5, "Hi");  Thay thế chuỗi từ vị trí 0 đến 5 bằng chuỗi "Hi"
        //
        arr.reverse() ;
        // chuyen tu stringbuffre sang string
        String newArr= arr.toString();
        System.out.println(newArr);
    }
}
