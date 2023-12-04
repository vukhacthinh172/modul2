package business.daoimpl;

import business.dao.IProductDao;
import business.entity.Product;
import business.util.IOFile;

import java.util.List;
import java.util.Objects;

public class ProductDaoImpl implements IProductDao {
    private static List<Product> productList;

    public ProductDaoImpl() {
        productList = IOFile.getListFormFile(IOFile.PRODUCT_PATH);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public Product findById(Long id) {
        for (Product p : productList) {
            if (Objects.equals(p.getProductId(), id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
// luu vao file
        IOFile.writeToFile(IOFile.PRODUCT_PATH, productList);
    }

    @Override
    public void update(Product product) {
        productList.set(productList.indexOf(findById(product.getProductId())), product);
        IOFile.writeToFile(IOFile.PRODUCT_PATH, productList);
    }

    @Override
    public void delete(Long id) {
        productList.remove(findById(id));
        IOFile.writeToFile(IOFile.PRODUCT_PATH, productList);
    }
}
