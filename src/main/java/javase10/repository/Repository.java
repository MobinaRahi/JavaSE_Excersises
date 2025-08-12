package javase10.repository;

public interface Repository<T ,I> {
    void save(T t)throws Exception;
    void edit(T t)throws Exception;
    void delete(I i)throws Exception;
}
