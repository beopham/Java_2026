package Ontap_PreparedStatement_lan1.DAO;

import Ontap_PreparedStatement_lan1.Database.JDBCUtil;
import Ontap_PreparedStatement_lan1.Model.SinhVien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DaoSinhVien implements DaoInterface<SinhVien>{

    @Override
    public int Insert(SinhVien sinhVien) {
        int ketqua=0;
        try {
            Connection con= JDBCUtil.getConnection();
            String sql = "INSERT INTO `sinhvien_titv`.`sinhvien` (`ten`, `tuoi`, `diachi`, `ngaysinh`)" +
                    " VALUES (?,?,?,?);";
            // tạo đối tưng
            PreparedStatement preparedStatement= con.prepareStatement(sql);
            preparedStatement.setString(1,sinhVien.getTen());
            preparedStatement.setInt(2,sinhVien.getTuoi());
            preparedStatement.setString(3,sinhVien.getDiachi());
            preparedStatement.setObject(4,sinhVien.getNgayinh());
            ketqua = preparedStatement.executeUpdate();
            if(ketqua==1)
            {
                System.out.println("đã thêm thành công");
            }
            else
            {
                System.out.println("chưa thêm đc");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int Delete(SinhVien sinhVien) {
        int ketqua=0;
        try {
             Connection con=JDBCUtil.getConnection();
             String sql = "DELETE FROM `sinhvien_titv`.`sinhvien` " +
                    "WHERE `id_sv` = ?  ";
             PreparedStatement preparedStatement= con.prepareStatement(sql);
             preparedStatement.setInt(1,sinhVien.getId());
            ketqua = preparedStatement.executeUpdate();
            if(ketqua==1)
            {
                System.out.println("đã xóa thành công");
            }
            else
            {
                System.out.println("chưa xóa đc");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public int Update(SinhVien sinhVien) {
        int ketqua=0;
        try {
            Connection con=JDBCUtil.getConnection();
            String sql = "UPDATE `sinhvien_titv`.`sinhvien` " +
                    "SET " +
                    "`ten` =   ? " +
                    "`tuoi` =  ?" +
                    "`diachi` = ?" +
                    "`ngaysinh` =? " +
                    "WHERE `id_sv` = ?   ";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, sinhVien.getTen());
            pre.setInt(2, sinhVien.getTuoi());
            pre.setString(3, sinhVien.getDiachi());
            pre.setObject(4, sinhVien.getNgayinh());
            pre.setInt(5, sinhVien.getId());
            ketqua = pre.executeUpdate();
            if(ketqua==1)
            {
                System.out.println("đã cập nhập thành công");
            }
            else
            {
                System.out.println("chưa cập nhập  đc");
            }
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ketqua;
    }

    @Override
    public List<SinhVien> selectAll() {
        List<SinhVien> danhsachsinhvien=new ArrayList<>();
        try {
            Connection con=JDBCUtil.getConnection();
            String sql = "select * from sinhvien";
            PreparedStatement preparedStatement= con.prepareStatement(sql);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next())
            {
                int id = rs.getInt("id_sv");
                String ten = rs.getString("ten");
                int tuoi = rs.getInt("tuoi");
                String diachi = rs.getString("diachi");
                LocalDate ngaysinh=rs.getObject("ngaysinh", LocalDate.class);
                SinhVien sv=new SinhVien(id,ten,tuoi,diachi,ngaysinh);
                danhsachsinhvien.add(sv);
            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return danhsachsinhvien;
    }

    @Override
    public SinhVien selectByid(int id) {
        SinhVien sv=null;
        try {
            Connection con=JDBCUtil.getConnection();
            String sql = "SELECT * FROM sinhvien WHERE id_sv = ? " ;
            PreparedStatement preparedStatement= con.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            ResultSet rs=preparedStatement.executeQuery();
            while (rs.next())
            {
                int id_sv = rs.getInt("id_sv");
                String ten = rs.getString("ten");
                int tuoi = rs.getInt("tuoi");
                String diachi = rs.getString("diachi");
                LocalDate ngaysinh=rs.getObject("ngaysinh", LocalDate.class);
                sv=new SinhVien(id_sv,ten,tuoi,diachi,ngaysinh);

            }

            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sv;
    }
}
