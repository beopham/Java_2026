package Ontap_PreparedStatement_lan1.DAO;

import java.util.ArrayList;
import java.util.List;

public interface DaoInterface<T> {

    public int Insert(T t);
    public int Delete(T t);
    public int Update(T t);
    public List<T> selectAll();
    public T selectByid(int id);
}
