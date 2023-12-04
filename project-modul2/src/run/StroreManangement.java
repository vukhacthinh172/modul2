package run;

import business.entity.Admin;
import business.entity.Catalog;
import business.entity.Product;
import business.service.ICatalogService;
import business.service.IProductService;
import business.serviceimpl.AuthenticationService;
import business.serviceimpl.CatalogServiceImpl;
import business.serviceimpl.ProductServiceImpl;
import business.util.InputMethods;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class StroreManangement {
    private static ICatalogService iCatalogService = new CatalogServiceImpl();
    private static final IProductService productService = new ProductServiceImpl();
    //   private static Scanner sc = new Scanner(System.in);
    private static boolean isLoggedIn = false;

    public static void main(String[] args) {
        login();

        do {
            System.out.println("--------- Menu chức năng ----------");
            System.out.println("1. Quản lí danh mục");
            System.out.println("2. Quản lí sản phẩm");
            System.out.println("0. Đăng xuất");

            // yêu cầu nhập lựa chọn
            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // điều hướng menu Quản lí danh mục
                    menuCatalog();
                    break;
                case 2:
                    // điều hướng menu Quản lí sản phẩm
                    menuProduct();
                    break;
                case 0:
                    // thoát
                    System.out.println("đang đăng xuất....");
                    login();
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ !");
                    break;
            }
        } while (true);

    }

    // xử li các chức năng của danh mục
    public static void menuCatalog() {
        while (true) {
            System.out.println("--------- Menu Quản lí danh mục ----------");
            System.out.println("1. Hiển thị danh sách danh mục");
            System.out.println("2. Thêm mới danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("0. Quay lại menu chính");

            System.out.println("Hãy nhập vào lựa chọn");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // Hiển thị danh sách danh mục
                    displayCatalog();
                    break;
                case 2:
                    // Thêm mới danh mục
                    createCatalog();
                    break;
                case 3:
                    // Cập nhật danh mục
                    updateCatalog();
                    break;
                case 4:
                    catalogDelete();
                    // Xóa danh mục
                    break;
                case 0:
                    // Quay lại menu chính

                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ !");
                    break;
            }
        }

    }

    // xử lí các chức năng của sản phẩm
    public static void menuProduct() {

        // lấy ra được đối tượng cần thay đổi trạng thái Catalog
        // dùng setter để thay đổi trạng thái từ true về false
        // lưu đối tượng vừa sửa vào danh sách
        while (true) {
            System.out.println("======================Product Management======================");
            System.out.println("1. Hiển thị toàn bộ danh sách sản phẩm");
            System.out.println("2. Thêm mới sản phẩm");
            System.out.println("3. Cập nhật thông tin sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm theo tên");
            System.out.println("6.quay lại menu chính");
            System.out.println("0. Thoát");
            System.out.println("------Nhập lựa chọn của bạn --------");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    // chức năng hiển thị
                    displayListProduct(productService.findAllSortByPrice());
                    break;
                case 2:
                    // thêm mới
                    createNewProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    deleteProduct();
                    break;
                case 5:
                    // -----------------------------tìm kiếm theo tên--------------------------
                    System.out.println(" nhập tên cần tìm kiếm ");
                    String sreach = InputMethods.getString();
                    List<Product> sreachResult = productService.searchProductByName(sreach);
                    if (sreachResult.isEmpty()) {
                        System.out.println("không tìm thấy kết quả phù hợp ");
                    } else {
                        System.out.println("kết quả cần tìm là ");
                        for (Product p : sreachResult) {
                            System.out.println(p);
                        }
                    }
                    break;
                case 6:
                    // quay lại menu chính
                    return;
                case 0:
                    //thoat
                    System.exit(0);
                    break;
                default:
                    System.err.println("Nhập không hợp lệ , thử lại !!!");
            }
        }
    }

    // --------------------------chức năng hiển thị danh mục catalog----------------------
    public static void displayCatalog() {
        List<Catalog> catalogs = iCatalogService.findAllOrderByCreatedDate();
        if (catalogs.isEmpty()) {
            System.err.println("danh sách trống ");
            return;
        } else {
            System.out.println("----------------------------------------------------");
            System.out.printf("| %-5s | %-20s | %-25s |%n", "ID", "Tên danh mục", "Ngày tạo");
            System.out.println("-----------------------------------------------------------------------------------");

            // In danh sách danh mục
            for (Catalog cat : catalogs) {
                DateTimeFormatter dft = DateTimeFormatter.ofPattern("YYYY-MM-dd");
                System.out.printf("| %-5s | %-20s | %-25s  |%n",
                        cat.getCatalogId(), cat.getCatalogName(), dft.format(cat.getCreateAt()));
            }

            // Kết thúc bảng
            System.out.println("----------------------------------------------------");
        }
    }

    // --------------------------------tạo mới danh mục---------------------
    public static void createCatalog() {
        System.out.println("Hãy nhập số lượng danh mục muốn thêm ");
        int count = InputMethods.getInteger();
        if (count <= 0) {
            System.err.println("vui lòng nhập số > 0 ");
            return;
        }
        while (true) {
            System.out.println("Nhập tên danh mục để kiểm tra sự tồn tại:");
            String catalogNameToCheck = InputMethods.getString();
            if (!iCatalogService.checkExitByCatalogName(catalogNameToCheck)) {
                for (int i = 0; i < count; i++) {
                    System.out.println("Thêm danh mục thứ " + i + 1);
                    Long newId = iCatalogService.getNewIdCatalog();
                    System.out.println("Mã danh mục  : " + newId);
                    System.out.println("Nhập tên cho danh mục");
                    String newName = InputMethods.getString();
                    System.out.println("Nhập mô tả");
                    String newDescription = InputMethods.getString();
                    // String dateTimeString = sc.nextLine();
                    LocalDateTime localDateTime = LocalDateTime.now();
                    System.out.println("Nhập trạng thái");
                    boolean catalogStatus = InputMethods.getBoolean();
                    Catalog newCatalog = new Catalog(newId, newName, newDescription, localDateTime, catalogStatus);
                    // tiến hành gọi service để thêm mơi
                    iCatalogService.createCatalog(newCatalog);
                }
                System.out.println("Thêm mới " + count + "  danh mục thành công");
                break;
            } else {
                System.out.println("Danh mục đã tồn tại. Vui lòng nhập tên khác.");
            }
        }
    }

    //----------------------------sửa danh mục---------------------------------------
    public static void updateCatalog() {
        System.out.println(" hay nhap lai ma  danh mục can sua ");
        Long idEdit = InputMethods.getLong();
        Catalog catalog1 = iCatalogService.findById(idEdit);
        if (catalog1 == null) {
            System.err.println("k tim thay  danh mục phu hop ");
            return;
        }
        System.out.println("--------Thông tin  danh mục cần sửa là ----------");
        System.out.println(catalog1);
        System.out.println("----Hãy nhập giá trị mới-----");
        System.out.println("Nhập tên mới cho  danh mục");
        catalog1.setCatalogName(InputMethods.getString());
        System.out.println("Nhập mô tả mới");
        catalog1.setDescriptionCatalog(InputMethods.getString());
        System.out.println("Nhập trạng thái cập nhật");
        catalog1.setStatusCatalog(InputMethods.getBoolean());
        iCatalogService.update(catalog1);
        System.out.println("Cập nhật  danh mục thành công");
    }

    //---------------------- xóa danh mục --------------------------
    public static void catalogDelete() {
        System.out.println(" hay nhap lai ma  danh mục can xoa ");
        Long idEdit = InputMethods.getLong();
        Catalog catalog1 = iCatalogService.findById(idEdit);
        if (catalog1 == null) {
            System.err.println("k tim thay  danh mục phu hop ");
            return;
        }
        iCatalogService.deleteByCatalog(idEdit);
        System.out.println("Đã xóa thành công");

    }
    //------------------- hiển thị sản phẩm -----------------

    public static void displayListProduct(List<Product> list) {
        if (list.isEmpty()) {
            System.err.println("danh sach ko co phan tu nao duoc tim thay ");
        } else {
            list.forEach(System.out::println);
        }
    }

    // ------------------- thêm mới sản phẩm-----------------------
    public static void createNewProduct() {
        Long catalogId;
        while (true) {
            System.out.println(" Nhập mã danh mục để thêm sản phẩm: ");
            catalogId = InputMethods.getLong();
            if (iCatalogService.findById(catalogId) == null) {
                System.out.println("ko tìm thấy danh mục sản phẩm cần thêm ");
            } else {
                break;
            }
        }

        // bắt người dùng nhập số lượng muốn thêm
        System.out.println("Hãy nhập số lượng sản phẩm muốn thêm");
        int count = InputMethods.getInteger();
        if (count <= 0) {
            System.err.println("vui lòng nhập số > 0");
            return;
        }
        for (int i = 1; i <= count; i++) {
            System.out.println("Thêm sản phẩm thứ " + i);
            Long newId = productService.getNewId();
            System.out.println("Mã sản phẩm : " + newId);
            // nhập  các thông tin cho sản phẩm ;
            System.out.println("Nhập tên cho sp");
            String newName = InputMethods.getString();
            System.out.println("Nhập mô tả");
            String newDescription = InputMethods.getString();
            System.out.println("Nhập giá bán ");
            double priceSale = InputMethods.getDouble();
            System.out.println("Nhập số lượng cần thêm");
            int stockNew = InputMethods.getInteger();
            System.out.println("Nhập trạng thái");
            boolean productStatus = InputMethods.getBoolean();

            // tạo ra đối tượng cần thêm mới
            Product newProduct = new Product(newId, newName, newDescription, priceSale, stockNew, productStatus);
            newProduct.setCatalogId(catalogId);
            // tiến hành gọi service để thêm mơi
            productService.create(newProduct);
        }
        System.out.println("Thêm mới " + count + " sản phẩm thành công");
    }

    // ------------------- sửa sản phẩm -----------------------------
    public static void updateProduct() {
        Long catalogId;
        while (true) {
            System.out.println(" Nhập mã danh mục chứa sản phẩm: ");
            catalogId = InputMethods.getLong();
            if (iCatalogService.findById(catalogId) == null) {
                System.out.println("ko tìm thấy danh mục sản phẩm cần thêm ");
            } else {
                break;
            }
        }
        System.out.println("  Nhập mã sản phẩm cần sửa : ");
        Long idEdit = InputMethods.getLong();
        Product productEdit = productService.findById(idEdit);
        if (productEdit == null) {
            System.err.println("k tim thay san pham phu hop ");
            return;
        }
        System.out.println("--------Thông tin sản phẩm cần sửa là ----------");
        System.out.println(productEdit);
        System.out.println("----Hãy nhập giá trị mới-----");
        // nhập  các thông tin cho sản phẩm ;
        System.out.println("Nhập tên mới cho sp");
        productEdit.setProductName(InputMethods.getString());
        System.out.println("Nhập mô tả mới");
        productEdit.setDescriptionProduct(InputMethods.getString());
        System.out.println("Nhập giá bán mới");
        productEdit.setUnitPrice(InputMethods.getDouble());
        System.out.println("Nhập số lượng cần cập nhật");
        productEdit.setStock(InputMethods.getInteger());
        System.out.println("Nhập trạng thái cập nhật");
        productEdit.setStatusProduct(InputMethods.getBoolean());

        // tiến hành gọi service để thêm mơi
        productService.update(productEdit);
        System.out.println("Cập nhật sản phẩm thành công");
    }

    //---------------------------- xóa sản phẩm---------------------
    public static void deleteProduct() {
        System.out.println("hay nhap ma san pham can xoa ");
        Long idDel = InputMethods.getLong();
        Product productEdit = productService.findById(idDel);
        if (productEdit == null) {
            System.err.println("Không tìm thấy sản phẩm phù hợp ");
            return;
        }
        productService.delete(idDel);
        System.out.println("Đã xóa thành công");
    }

    // ------------ dang nhap-------------
    public static void login() {
        while (true) {
            System.out.println("Đăng nhập:");
            System.out.print("Tên đăng nhập: ");
            String adminName = InputMethods.getString();
            System.out.print("Mật khẩu: ");
            String password = InputMethods.getString();
            isLoggedIn = AuthenticationService.authenticateAdmin(adminName, password);

            if (isLoggedIn) {
                System.out.println("Đăng nhập thành công!");
                break;
            } else {
                System.out.println("Đăng nhập không thành công. Vui lòng kiểm tra lại tên đăng nhập và mật khẩu.");
            }
        }
    }

    public static void logOut() {
        isLoggedIn = false;
        System.out.println("logout thành công ");
    }
}
