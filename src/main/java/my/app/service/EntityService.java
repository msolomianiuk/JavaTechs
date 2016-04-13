package my.app.service;

import java.util.List;

public interface EntityService<T> {
    List<T> getAll();

    void saveOrUpdate(T t);

    void delete(long id);
}
