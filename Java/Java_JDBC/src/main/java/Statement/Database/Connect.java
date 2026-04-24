package Statement.Database;

import java.sql.Connection;

public class Connect {
    public static void main(String[] args) {
        // 1. Lấy kết nối
        Connection connection = JDBCUtil.getConnection();

        if (connection != null) {
            System.out.println("--- Kết nối thành công rồi nè Nam! ---");

            // 2. In thông tin database ra xem thử
            System.out.println("Thông tin hệ quản trị CSDL:");
            JDBCUtil.printInfo(connection);

            // 3. Đóng kết nối sau khi dùng xong
            JDBCUtil.closeConnection(connection);
            System.out.println("--- Đã đóng kết nối an toàn ---");
        } else {
            System.out.println("Kết nối thất bại, kiểm tra lại MySQL Server hoặc Database name nha.");
        }
    }
}
