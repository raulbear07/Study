package rr.com.springmvc.dao;

import java.util.List;

public interface IBaseDao<T> {
    int save( T t);
    //void delete();
    //oid update(T t);
    T findById(long id);
    //List<T> findAll();
}
