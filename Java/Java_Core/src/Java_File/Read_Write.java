
package Java_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write {
	public static void main(String[] args) {
		// Chỉ dùng 1 dấu gạch xuôi, cực kỳ gọn:
		File file = new File("D:/Cuoc_Doi_2026/Java/Java_Core/src/Java_File/output/nam.txt");
		try {
			if (file.exists()) {
				System.out.println("file đã tồn tại");
			} else {
				if (file.createNewFile()) {
					System.out.println("tạo file thành công");
				} else {
					System.out.println("tạo file thất bại");
				}
			}
			try (FileWriter fileWriter = new FileWriter(file, true)) // tạo cay but ,true đó là ghi đè đó nha ví dụ 1
																		// thêm 1 2 là thành 1 1 2
			{
				BufferedWriter bw = new BufferedWriter(fileWriter);
				bw.write("phạm văn nam");
				bw.newLine();
				bw.write("phạm văn linh");
				bw.newLine();
				bw.close();
			}
			try (FileReader fileReader = new FileReader(file)) // tạo cay but
			{
				BufferedReader br = new BufferedReader(fileReader);
				String noidung;
				while ((noidung = br.readLine()) != null) {
					System.out.println(noidung);
				}

				br.close();
				fileReader.close();
			}
		} catch (IOException e) {
			System.out.println("Lỗi đường dẫn " + e.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lỗi không xác định: " + e.getMessage());
		}
	}
}