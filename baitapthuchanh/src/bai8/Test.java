package bai8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        TransportationService transportationService = new TransportationService();
        Transportation car = new Car(1, "toyota", 2010, 50.0, "blue", 7, "V4");
        Transportation motobike = new Motobike(2, "mitsubishi", 2015, 80.00, "red", "V7");
        Transportation truck = new Truck(3, "honda", 2014, 20.0, "green", 7000);
        transportationService.addTransportation(car);
        transportationService.addTransportation(motobike);
        transportationService.addTransportation(truck);
        showTransportationList(transportationService);
        // xoa theo id
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id muon xoa ");
        int deleId = sc.nextInt();
        if (transportationService.findById(deleId) == null) {
            System.err.println("ko co id muon xoa");
        } else {
            transportationService.deleteId(deleId);
            showTransportationList(transportationService);

        }
        System.out.println("danh sach phuong tien tham gia giao  thong sau khi da sap xeo theo gia");
        transportationService.softByPrice();
        showTransportationList(transportationService);
        sc.nextLine();
        System.out.println("nhap mau muon tim");
        String findColor = sc.nextLine();
        Transportation foundTransportation = transportationService.findByColor(findColor);
        if (foundTransportation == null) {
            System.out.println("ko co phuong tien nao co mau " + findColor);
        } else {
            System.out.println("Danh sách phương tiện có màu " + findColor + ":");
               
        }
    }

    public static void showTransportationList(TransportationService transportation) {
        System.out.println("danh sach phuong tien gia thong");
        List<Transportation> transportationList = transportation.getAll();
        if (transportationList.isEmpty()) {
            System.out.println("danh sach trong");
        } else {
            for (Transportation tr : transportationList) {
                System.out.println(tr);
            }
        }

    }
}
