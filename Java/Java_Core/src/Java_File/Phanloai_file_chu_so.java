package Java_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Phanloai_file_chu_so {
    public static boolean kiemtraso(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // Đường dẫn file
        String url_goc = "D:/Cuoc_Doi_2026/Java/Java_Core/src/Java_File/output/filegoc.txt";
        String url_so = "D:/Cuoc_Doi_2026/Java/Java_Core/src/Java_File/output/file_so.txt";
        String url_chu = "D:/Cuoc_Doi_2026/Java/Java_Core/src/Java_File/output/file_chu.txt";

        try (
            BufferedReader br_goc = new BufferedReader(new FileReader(url_goc));
            BufferedWriter wr_so = new BufferedWriter(new FileWriter(url_so));
            BufferedWriter wr_chu = new BufferedWriter(new FileWriter(url_chu))
        ) {
            String line;
            while ((line = br_goc.readLine()) != null) {
                System.out.println("Nội dung đọc được: " + line);
                
                line = line.trim();
                if (line.isEmpty()) {
                    continue; // Bỏ qua dòng trống và tiếp tục dòng tiếp theo
                }

                // SỬA TẠI ĐÂY: Truyền 'line' vào để kiểm tra
                if (kiemtraso(line)) {
                    // SỬA TẠI ĐÂY: Ghi nội dung 'line' vào file số
                    wr_so.write(line);
                    wr_so.newLine(); // Thêm dòng mới
                } else {
                    // SỬA TẠI ĐÂY: Ghi nội dung 'line' vào file chữ
                    wr_chu.write(line);
                    wr_chu.newLine(); // Thêm dòng mới
                }
                // TUYỆT ĐỐI KHÔNG dùng .close() ở đây
            }
            System.out.println("Đã phân loại xong!");

        } catch (Exception e) {
            System.err.println("Lỗi hệ thống: " + e.getMessage());
        }
    }
}