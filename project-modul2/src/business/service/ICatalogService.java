package business.service;

import business.entity.Catalog;
import business.entity.Product;

import java.util.List;

public interface ICatalogService {
    List<Catalog> findAllOrderByCreatedDate();
    void createCatalog(Catalog catalog);
    void deleteByCatalog(Long id);
    void  update(Catalog p);
    Catalog findById(Long id);
    boolean checkExitByCatalogName(String catalog);
    Long getNewIdCatalog();
}
