package business.serviceimpl;

import business.dao.ICatalogDao;
import business.daoimpl.CatalogDaoImpl;
import business.entity.Catalog;
import business.entity.Product;
import business.service.ICatalogService;

import java.util.stream.Collectors;
import java.util.List;

public class CatalogServiceImpl implements ICatalogService {
    private static ICatalogDao catalogDao = new CatalogDaoImpl();
    @Override
    public void update(Catalog c) {
        catalogDao.update(c);
    }
    @Override
    public List<Catalog> findAllOrderByCreatedDate() {
        return catalogDao.findAll().stream()
                .sorted((c1, c2) -> c2.getCreateAt().compareTo(c1.getCreateAt()))
                .collect(Collectors.toList());
    }

    @Override
    public void createCatalog(Catalog c) {
        catalogDao.add(c);
    }

    @Override
    public void deleteByCatalog(Long id) {
        catalogDao.delete(id);
    }

    @Override
    public Catalog findById(Long id) {
        return catalogDao.findById(id);
    }

    @Override
    public boolean checkExitByCatalogName(String catalogName) {
        for (Catalog cat: catalogDao.findAll()) {
            if (cat.getCatalogName().equals(catalogName))
            return true ;
        }
        return false ;
    }

    public Long getNewIdCatalog() {
        Long idMax = 0L;
        for (Catalog c : catalogDao.findAll()) {
            if (idMax < c.getCatalogId()) {
                idMax = c.getCatalogId();
            }
        }
        return idMax + 1;
    }
}
