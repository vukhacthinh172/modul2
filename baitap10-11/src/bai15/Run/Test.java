package bai15.Run;

import bai15.Model.Student;
import bai15.Service.StudentManagement;

import java.util.List;
import java.util.Scanner;

public class Test {
    private StudentManagement studentManagement = new StudentManagement();

    public static void main(String[] args) {
        Test test = new Test();
        test.runMain();
    }

    private void runMain() {
        while (true) {
            System.out.println("--------------------MENU--------------------------");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm mới sinh viên");
            System.out.println("3.  Xóa sinh viên sinh viên");
            System.out.println("4.Tìm kiếm sinh viên theo id ");
            System.out.println("5.Trả vêf diểm trung bình của tất cả sinh viên ");
            System.out.println("6.sắp sếp sinh viên theo điểm tăng dần ");
            System.out.println("7. Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            Scanner sc = new Scanner(System.in);
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                    //hiển thị danh sách sinh viên
                    showStudentList();
                    break;
                case 2:
                    // thêm mới sinh viên
                    addNewStudent();
                    break;
                case 3:
                    //xóa sinh viên theo id
                    deleId();
                    break;
                case 4:
                    //  tìm kiếm sinh viên theo id
                    findStudent();
                    break;
                case 5:
                    //  hiển thị điểm trung bình
                    diemTrungBinh();
                    break;
                case 6:
                    //  sắp sếp theo thứ tự của điểm
                    sapXep();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    break;

            }
        }
    }


    private  void showStudentList() {
        System.out.println("danh sách sinh viên là: ");
        List<Student> studentList = studentManagement.showAll();
        if (studentList.isEmpty()) {
            System.out.println(" không có sinh viên để hiển thị");
        } else {
            for (Student s : studentList) {
                System.out.println(s);
            }
        }
    }

    private void addNewStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin mới cho sinh viên:");

        System.out.print("Nhập studentId: ");
        int studentId = scanner.nextInt();

        System.out.print("Nhập tên sinh viên: ");
        String studentName = scanner.next();

        System.out.print("Nhập điểm sinh viên: ");
        double studentScore = scanner.nextDouble();

        // Tạo đối tượng sinh viên mới
        Student newStudent = new Student(studentId, studentName, studentScore);

        // Thêm sinh viên vào quản lý sinh viên
        studentManagement.addStudent(newStudent);

        System.out.println("Sinh viên mới đã được thêm thành công!");
    }
    // xoá
    private  void  deleId(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap id muon xoa");
        int id = sc.nextInt();
        if (studentManagement.findStudentById(id)==null){
            System.out.println("ko co id phu hop ");
        }else {
            studentManagement.removeStudent(id);
            showStudentList();
        }
    }
    private  void  findStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap id muon tim");
        int id = sc.nextInt();
        if (studentManagement.findStudentById(id)==null){
            System.out.println("ko co id phu hop ");
        }else{
            // hiển thị đối tượng studen theo id mong muốn
            Student foundStudent = studentManagement.findStudentById(id);
            System.out.println("Thông tin sinh viên có ID " + id + ":");
            System.out.println(foundStudent);
        }
    }
    private  Double  diemTrungBinh(){
      return  studentManagement.getAverageScore();
    }
    private void  sapXep(){
        studentManagement.sortByScore();
    }
}
