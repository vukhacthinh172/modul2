package bai1;

public class Main {
    public static void main(String[] args) {
        String chuoi = "w3resoeurce";
        for (int i = 0; i <chuoi.length() ; i++) {
            char kiTu = chuoi.charAt(i);
            if (kiTu==' '){
                 continue;
            }
            int soLanXuatHien = 1;
            for (int j = i+1; j <chuoi.length() ; j++) {
                if (kiTu==chuoi.charAt(j)){
                    soLanXuatHien++;
                    chuoi = chuoi.substring(0, j) + " " + chuoi.substring(j + 1);
                }
            }
            if (soLanXuatHien>1){
                System.out.println("ki tu "+Character.toString(kiTu)+" xuat hien "+soLanXuatHien);
            }
        }
    }
}
