import java.util.Scanner;

public class EmployeeTest {
    private static Employee[] arr = new Employee[5];
    private static int count = 0;

    public static void main(String[] args) {
        Employee e = new Employee();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------------------------Quản lý nhân viên-----------------------");
            System.out.println("1. Hiển thị danh sách nhân viên\n" +
                    "2. Thêm mới nhân viên\n" +
                    "3. Update thông tin nhân viên theo id\n" +
                    "4. Xoá nhân viên theo id\n" +
                    "5. Thoát\n");
            System.out.println("nhập lưa chọn của bạn : ");
            byte choice = sc.nextByte();
            switch (choice) {
                case 1:
                    showAllStaff();
                    //hiển thị danh sách nhân viên
                    break;
                case 2:
                    creatStaff();
                    // thêm mới nhân viên
                    break;
                case 3:
                    System.out.println("nhap id cần sửa");
                    int staffEditId = sc.nextInt();
                    updateStaff(staffEditId);
                    // update thông tin nhân viên theo id
                    break;
                case 4:
                    System.out.println("nhap id cần xóa");
                    int idDel = sc.nextInt();
                    deleteStaff(idDel);
                    // xóa nhân viên theo id
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("nhập sai, vui lòng nhập lại ");
                    break;
            }
        }
    }

    public static void showAllStaff() {
        if (count == 0) {
            System.out.println("hông có nhân viên nào để hiển thị");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void creatStaff() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so luong nhan vien can them moi ");
        int quantity = sc.nextInt();
        if (quantity > arr.length - count) {
            System.out.println("vượt quá số lượng");
            return;
        }
        for (int i = 0; i < quantity; i++) {
            Employee employee = new Employee();
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i + 1));
            System.out.println("Nhập id");
            employee.setEmployeeId(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập tên nhan viên");
            employee.setEmployeeName(sc.nextLine());
            System.out.println("Nhập giới tính :");
            employee.setGen(sc.nextLine().equalsIgnoreCase("Nam"));
            System.out.println("Nhập tuổi");
            employee.setAge(sc.nextInt());
            sc.nextLine();
            System.out.println("Nhập hệ số lương ");
            employee.setRate(sc.nextDouble());
            arr[count++] = employee;
        }
        System.out.println(" thêm mới thành công");
    }

    public static void updateStaff(int staffEditId) {
        Scanner sc = new Scanner(System.in);
        int index = getIndexByStaff(staffEditId);
        if (index==-1){
            System.out.println("k tìm thấy nhân viên  phù hợp");
            return;
        }
        System.out.println("------------Thông tin nhân viên cũ---------------");
        System.out.println(arr[index]);
        System.out.println("Nhập tên nhân viên mới");
        arr[index].setEmployeeName(sc.nextLine());
        System.out.println("Nhập giới tính mới : True/flase");
        arr[index].setGen(sc.nextLine().equalsIgnoreCase("Nam"));
        System.out.println("Nhập tuổi mới");
        arr[index].setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Cập nhật thành công");
    }
    public  static  void  deleteStaff(int idDel){
        Scanner sc = new Scanner(System.in);
        int index = getIndexByStaff(idDel);
        if (index==-1){
            System.out.println("k tìm thấy nhân viên  phù hợp");
            return;
        }
        for (int i = index+1; i <count ; i++) {
            arr[i-1]= arr[i];
        }
        arr[count-1]=null ;
        count--;
        System.out.println("xóa thành công ");
    }

    public static int getIndexByStaff(int id) {
        for (int i = 0; i < count; i++) {
            if (id == arr[i].getEmployeeId()) {
                return i;
            }

        }
        return -1 ;
    }
}