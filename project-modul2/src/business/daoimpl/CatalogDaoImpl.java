package business.daoimpl;

import business.dao.ICatalogDao;

import java.util.ArrayList;
import java.util.List;

import business.entity.Catalog;
import business.util.IOFile;

public class CatalogDaoImpl implements ICatalogDao {
    private  List<Catalog> catalogs ;
    public CatalogDaoImpl() {
       this.catalogs = IOFile.getListFormFile(IOFile.CATALOG_PATH);
    }

    @Override
    public List<Catalog> findAll() {
        return new ArrayList<>(catalogs);
    }

    @Override
    public Catalog findById(Long id) {
        for (Catalog cat : catalogs) {
            if (cat.getCatalogId() == id) {
                return cat;
            }
        }
        return null;
    }

    @Override
    public void add(Catalog catalog) {
        catalogs.add(catalog);
        IOFile.writeToFile(IOFile.CATALOG_PATH, catalogs);
    }

    @Override
    public void update(Catalog catalog) {
        for (Catalog cat : catalogs) {
            if (cat.getCatalogId() == catalog.getCatalogId()) {
    cat.setCatalogName(catalog.getCatalogName());
    cat.setStatusCatalog(catalog.isStatusCatalog());
    cat.setDescriptionCatalog(catalog.getDescriptionCatalog());
                IOFile.writeToFile(IOFile.CATALOG_PATH, catalogs);
    break;
            }
        }
    }

    @Override
    public void delete(Long id) {
        catalogs.removeIf(cat -> cat.getCatalogId() == id);
        IOFile.writeToFile(IOFile.CATALOG_PATH, catalogs);
    }
}
