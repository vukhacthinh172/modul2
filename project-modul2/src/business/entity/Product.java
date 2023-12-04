package business.entity;

import business.util.Formatter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Product implements Serializable {
    private Long productId;
    private  String productName;
    private String descriptionProduct;
    private  double unitPrice;
    private  int stock;
    private  boolean statusProduct;
    private Long catalogId ;

    public Product() {
    }

    public Product(Long productId, String productName, String descriptionProduct, double unitPrice, int stock, boolean statusProduct) {
        this.productId = productId;
        this.productName = productName;
        this.descriptionProduct = descriptionProduct;
        this.unitPrice = unitPrice;
        this.stock = stock;
        this.statusProduct = statusProduct;
    }

    public Long getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(Long catalogId) {
        this.catalogId = catalogId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isStatusProduct() {
        return statusProduct;
    }

    public void setStatusProduct(boolean statusProduct) {
        this.statusProduct = statusProduct;
    }

    @Override
    public String toString() {

        return "{" +
                ", ID sản phẩm /" + productId +
                ", Tên sản phẩm /'" + productName + '\'' +
                ", Mô tả/'" + descriptionProduct + '\'' +
                ", Giá tiền /" + Formatter.getNumberFomatterVND().format(unitPrice) +
                ", Số lượng /" + stock +
                ", Trạng thái  /" + (statusProduct ? "Đang bán" : "Ngừng bán " ) +
                ", ID giỏ hàng /" + catalogId +
                '}';
    }
}
