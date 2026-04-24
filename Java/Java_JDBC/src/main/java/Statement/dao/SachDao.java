package Statement.dao;



import Statement.Database.JDBCUtil;
import Statement.Model.Sach;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

public class SachDao implements DAOInterface<Sach> {
    private static SachDao instance;

    // Hàm getInstance để lấy đối tượng duy nhất đó
    public static SachDao getInstance() {
        if (instance == null) {
            instance = new SachDao();
        }
        return instance;
    }

    @Override
    public int insert(Sach sach) {
        int ketqua = 0;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "INSERT INTO `sinhvien_titv`.`sinhvien` (`ten`, `tuoi`, `diachi`, `ngaysinh`)" +
                    " VALUES ('" + sach.getTen() + "', " + sach.getTuoi() + ", '" +
                    sach.getDiachi() + "', '" + sach.getNgayinh() + "');";
            ketqua = st.executeUpdate(sql);
            if (ketqua == 1) {
                System.out.printf("ok");
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
            Statement st = con.createStatement();
            String sql = "DELETE FROM `sinhvien_titv`.`sinhvien` " +
                    "WHERE `id_sv` = " + sach.getId() + ";";
            ketqua = st.executeUpdate(sql);
            if (ketqua == 1) {
                System.out.printf("ok");
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
            Statement st = con.createStatement();
            String sql = "UPDATE `sinhvien_titv`.`sinhvien` " +
                    "SET " +
                    "`ten` = '" + sach.getTen() + "', " +
                    "`tuoi` = " + sach.getTuoi() + ", " +
                    "`diachi` = '" + sach.getDiachi() + "', " +
                    "`ngaysinh` = '" + sach.getNgayinh() + "' " +
                    "WHERE `id_sv` = " + sach.getId() + ";";
            ketqua = st.executeUpdate(sql);
            if (ketqua == 1) {
                System.out.printf("ok");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public ArrayList<Sach> selectALL() {
        ArrayList<Sach> danhsach_sach = new ArrayList<>();
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "select * from  sinhvien";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id_sv");
                String ten = rs.getString("ten");
                int tuoi = rs.getInt("tuoi");
                String diachi = rs.getString("diachi");
                LocalDate ngayinh = rs.getObject("ngaysinh", LocalDate.class);
                Sach sach = new Sach(id, ten, tuoi, diachi, ngayinh);
                danhsach_sach.add(sach);
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return danhsach_sach;
    }

    @Override
    public Sach selectByid(Sach sach) {
        Sach sach_timkiem = null;
        try {
            Connection con = JDBCUtil.getConnection();
            Statement st = con.createStatement();
            String sql = "SELECT * FROM sinhvien WHERE id_sv = '" + sach.getId() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id_sv");
                String ten = rs.getString("ten");
                int tuoi = rs.getInt("tuoi");
                String diachi = rs.getString("diachi");
                LocalDate ngayinh = rs.getObject("ngaysinh", LocalDate.class);
                sach_timkiem = new Sach(id, ten, tuoi, diachi, ngayinh);

            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return sach_timkiem;
    }
}
