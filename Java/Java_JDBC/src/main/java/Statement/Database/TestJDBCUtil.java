package Statement.Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBCUtil {
    public static void main(String[] args) {
        try {
            // bước 1 bước kết nối
            Connection con= JDBCUtil.getConnection();

            // bước 2 là tạo đối tượng statement
            Statement st=con.createStatement();
            // bước 3 là viết cau truy vấn
            String sql="INSERT INTO `sinhvien_titv`.`sinhvien` (`ten`, `tuoi`, `diachi`, `ngaysinh`)" +
                    " VALUES ('minh', '12', 'đà nẵng', '2003-09-11');\n";
            //Bước 4: Thực thi câu lệnh SQL
            st.executeUpdate(sql);
            // bước 5 ngắt kết nối
            JDBCUtil.closeConnection(con);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
