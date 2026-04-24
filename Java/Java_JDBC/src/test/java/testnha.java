
import Statement.Model.Sach;
import Statement.dao.SachDao;

import java.util.ArrayList;

public class testnha {
    public static void main(String[] args) {
//        Sach sach1=new Sach("Nam",90,"Đà Nẵng", LocalDate.of(2020,3,20));
////        SachDao dao=new SachDao();
////        dao.insert(sach1);
//        Sach sach1_cn=new Sach("Nam nha",93,"kakakak", LocalDate.of(2021,3,20),3);
//        SachDao.getInstance().insert(sach1);
//        SachDao.getInstance().update(sach1_cn);
//        Sach xoa=new Sach(5);
//        SachDao.getInstance().delete(xoa);
        Sach timkiem=new Sach(2);
        SachDao.getInstance().selectByid(timkiem);
        timkiem.display();
        ArrayList<Sach> saches=SachDao.getInstance().selectALL();
        for(Sach s:saches)
        {
            s.display();
        }

    }
}
