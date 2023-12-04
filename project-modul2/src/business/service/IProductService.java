package business.service;

import business.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    List<Product> findAllSortByPrice();
    Product findById(Long id);
    void  create(Product product);
    void  update(Product p);
    void  delete (Long id);
    Long getNewId();
   List< Product> searchProductByName(String productName);
}
