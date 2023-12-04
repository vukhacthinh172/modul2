package business.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Catalog implements Serializable {
    private  Long catalogId ;
    private  String catalogName ;
    private  String descriptionCatalog ;
    private LocalDateTime createAt ;
    private boolean statusCatalog;

    public Catalog() {
    }

    public Catalog(long catalogId, String catalogName, String descriptionCatalog, LocalDateTime createAt, boolean statusCatalog) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptionCatalog = descriptionCatalog;
        this.createAt = createAt;
        this.statusCatalog = statusCatalog;
    }

    public long getCatalogId() {
        return catalogId;
    }

//    public void setCatalogId(long catalogId) {
//        this.catalogId = catalogId;
//    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptionCatalog() {
        return descriptionCatalog;
    }

    public void setDescriptionCatalog(String descriptionCatalog) {
        this.descriptionCatalog = descriptionCatalog;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

//    public void setCreateAt(LocalDateTime createAt) {
//        this.createAt = createAt;
//    }


    public boolean isStatusCatalog() {
        return statusCatalog;
    }

    public void setStatusCatalog(boolean statusCatalog) {
        this.statusCatalog = statusCatalog;
    }

    @Override
    public String toString() {
        DateTimeFormatter dft = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return "Catalog{" +
                "catalogId=" + catalogId +
                ", catalogName='" + catalogName + '\'' +
                ", descriptionCatalog='" + descriptionCatalog + '\'' +
                ", createAt=" + dft.format(createAt) +
                ", statusCatalog=" + statusCatalog +
                '}';
    }
}
