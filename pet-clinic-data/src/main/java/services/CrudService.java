package services;

import java.util.Set;

/**
 * Created by @author issaclee725 on 6/02/2022
 */
public interface CrudService <T, ID>{

    Set<T> findall();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
