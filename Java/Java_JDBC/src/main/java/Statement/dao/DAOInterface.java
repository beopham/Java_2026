package Statement.dao;

import java.util.ArrayList;

public interface DAOInterface<T>{
    // dml
    public  int insert(T t);
    public  int delete(T t);
    public  int update(T t);
    // dql
    public ArrayList<T> selectALL();
    public  T selectByid(T t);

}
