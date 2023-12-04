package business.serviceimpl;

import business.dao.IProductDao;
import business.daoimpl.ProductDaoImpl;
import business.entity.Catalog;
import business.entity.Product;
import business.service.IProductService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements IProductService {
    private  static IProductDao productDao = new ProductDaoImpl();

    @Override
    public List<Product> searchProductByName(String productName) {
        List<Product> products = new ArrayList<>();
        for (Product pro : productDao.findAll()){
            if (pro.getProductName().equalsIgnoreCase(productName)){
                products.add(pro);
            }
        }
        return products ;

    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> findAllSortByPrice() {
        return productDao.findAll().stream().sorted(Comparator.comparingDouble(Product::getUnitPrice)).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public void create(Product p) {
           productDao.add(p);
    }

    @Override
    public void update(Product p) {
  productDao.update(p);
    }

    @Override
    public void delete(Long id) {
  productDao.delete(id);
    }

    @Override
    public Long getNewId() {
        Long idMax = 0L ;
        for (Product p : productDao.findAll()){
            if (idMax<p.getProductId()){
                idMax= p.getProductId();
            }
        }
        return  idMax+1;
    }

}
