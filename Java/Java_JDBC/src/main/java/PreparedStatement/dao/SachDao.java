package PreparedStatement.dao;

import PreparedStatement.database.JDBCUtil;
import PreparedStatement.database.TestJDBCUtil;
import PreparedStatement.model.Sach;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class SachDao implements DAOInterface<Sach> {
    @Override
    public int insert(Sach sach) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "INSERT INTO `sinhvien_titv`.`sinhvien` (`ten`, `tuoi`, `diachi`, `ngaysinh`)" +
                    " VALUES (?,?,?,?);";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, sach.getTen());
            pre.setInt(2, sach.getTuoi());
            pre.setString(3, sach.getDiachi());
            pre.setObject(4, sach.getNgayinh());
            int kq = pre.executeUpdate();
            if (kq == 1) {
                System.out.println("chèn thành công");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int delete(Sach sach) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "DELETE FROM `sinhvien_titv`.`sinhvien` " +
                    "WHERE `id_sv` = ?  ";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setInt(1, sach.getId());
            int kq = pre.executeUpdate();
            if (kq == 1) {
                System.out.println("xóa thành công");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int update(Sach sach) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "UPDATE `sinhvien_titv`.`sinhvien` " +
                    "SET " +
                    "`ten` =   ? " +
                    "`tuoi` =  ?" +
                    "`diachi` = ?" +
                    "`ngaysinh` =? " +
                    "WHERE `id_sv` = ?   ";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, sach.getTen());
            pre.setInt(2, sach.getTuoi());
            pre.setString(3, sach.getDiachi());
            pre.setObject(4, sach.getNgayinh());
            pre.setInt(5, sach.getId());
            int kq = pre.executeUpdate();
            if (kq == 1) {
                System.out.println("cập nhập thành công");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public ArrayList<Sach> selectAll() {
        ArrayList<Sach> danhsach = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "select * from  sinhvien";
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("id_sv");
                String ten = rs.getString("ten");
                int tuoi = rs.getInt("tuoi");
                String diachi = rs.getString("diachi");
                LocalDate ngaysinh=rs.getObject("ngaysinh", LocalDate.class);
                Sach sach=new Sach(id,ten,tuoi,diachi,ngaysinh);
                danhsach.add(sach);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhsach;
    }

    @Override
    public Sach selectbyid(Sach sach) {
        Sach book=null;
        try {
            Connection con = JDBCUtil.getConnection();
            String sql = "SELECT * FROM sinhvien WHERE id_sv = ? " ;
            PreparedStatement pre = con.prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("id_sv");
                String ten = rs.getString("ten");
                int tuoi = rs.getInt("tuoi");
                String diachi = rs.getString("diachi");
                LocalDate ngaysinh=rs.getObject("ngaysinh", LocalDate.class);
                book=new Sach(id,ten,tuoi,diachi,ngaysinh);

            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }
}
