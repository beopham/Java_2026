package Java_File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex1 {
	public static void main(String[] args) {

		String url = "D:/Cuoc_Doi_2026/Java/Java_Core/src/Java_File/output/nam1.txt";
		File file = new File(url);
		try {
			if (file.exists()) {
				System.out.println("File đã tồn tại");
			} else {
				if (file.createNewFile()) {
					System.out.println("File đã đc tạo ");
				} else {
					System.out.println("file k đc tạo");
				}
			}
			try (FileWriter fileWriter = new FileWriter(file, true); BufferedWriter bf = new BufferedWriter(fileWriter))
			{
				bf.write("nammmmm ơi");
				bf.newLine();
				bf.write("lan ơi");
				bf.newLine();
	
			}
			try (FileReader fileReader = new FileReader(file); BufferedReader br = new BufferedReader(fileReader)) 
			{
				String noidung;
				while ((noidung = br.readLine()) != null) {
					System.out.print(noidung);
				}
			}
		} catch (Exception e) {
			System.out.println("lỗi k xác định " + e.getMessage());
		}
	}
}
