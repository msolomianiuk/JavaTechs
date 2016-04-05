package my.app.service;

import java.util.List;

public interface EntityService<T> {
    void delete(long id);

    T getById(long id);

    T getByName(String name);

    void saveOrUpdate(T t);

    List<T> getAll();
}
