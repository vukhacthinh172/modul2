package business.dao;

import java.util.List;

public interface IGenericDao <T,E>{ // T là entity , E là kiểu dữ liệu của id của T
    List<T> findAll();
    T findById(E id);
    void  add(T t);
    void  update(T t);
    void  delete(E id);
}
