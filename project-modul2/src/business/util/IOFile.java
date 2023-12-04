package business.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
    public  static  String PRODUCT_PATH = "C:\\Users\\vukha\\Desktop\\baitapJava\\project-modul2\\src\\data\\product.txt";
    public  static  String CATALOG_PATH = "C:\\Users\\vukha\\Desktop\\baitapJava\\project-modul2\\src\\data\\catalog.txt";
    public static <T> List<T> getListFormFile(String path){
        File file = new File(path);// file la lop dai dien cho 1 tep , 1 thu muc trong may tinh
        if (!file.exists()){
            return  new ArrayList<>();
        }
        List<T> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);//cho phep doc du lieu dang nhi phan
            try {
                ObjectInputStream ois = new ObjectInputStream(fis);
                list = (List<T>) ois.readObject();
                //dong stream
                ois.close();

            } catch (IOException e) {
                System.err.println("loi khong doc duoc file");
            }
        } catch (FileNotFoundException e) {
            System.err.println("khong tim thay file ");
        }catch (ClassNotFoundException e) {
            System.err.println("khong tim thay class ");
        }
        return list;
    }
    public  static <T> void writeToFile(String path, List<T> list){
        File file = new File(path);
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
        } catch (FileNotFoundException e) {
            System.err.println("ko tim thay file ");
        } catch (IOException e) {
            System.err.println("loi ghi file ");
        }
    }
}
