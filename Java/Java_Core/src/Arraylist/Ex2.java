package Arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<Integer> mangso = new ArrayList<Integer>();
		Random rd = new Random();
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử");
		int n = nhap.nextInt();

		for (int i = 0; i < n; i++) {
			int phantu = rd.nextInt(-50, 50);
			mangso.add(phantu);
		}
		System.out.println(mangso.toString());
		int count_chan = 0;
		int sumchan = 0;
		int count_le = 0;
		int sumle = 0;
		int sumchanlon0 = 0;
		int sumchanle0 = 0;
		for (int i = 0; i < n; i++) {
			if (mangso.get(i) % 2 == 0) {
				count_chan++;
				sumchan += mangso.get(i);
				if (mangso.get(i) > 0) {
					sumchanlon0 += mangso.get(i);

				}
			} else if (mangso.get(i) % 2 != 0) {
				count_le++;
				sumle += mangso.get(i);
				if (mangso.get(i) > 0) {
					sumchanle0 = mangso.get(i);
				}
			}

			// In kết quả ra màn hìn
		}
		System.out.println("--- KẾT QUẢ ---");
		System.out.println("Số lượng số chẵn: " + count_chan);
		System.out.println("Tổng các số chẵn: " + sumchan);
		System.out.println("Số lượng số lẻ: " + count_le);
		System.out.println("Tổng các số lẻ: " + sumle);
		System.out.println("Tổng số chẵn dương (>0): " + sumchanlon0);
		System.out.println("Tổng số lẻ dương (>0): " + sumchanle0);

		System.out.println("Nhập vào số k để tìm kiếm nó có trong mảng hay k");
		int k = nhap.nextInt();
		int vitri = mangso.get(0);
		boolean timkiem = false;
		for (int i = 0; i < n; i++) {
			if (k == mangso.get(i)) {
				timkiem = true;
				vitri = k;
				System.out.println("Phân tử k có xuất hiện trong mảng nha và nó ở vị trí thứ " + i);
			}
		}
		if (timkiem == false) {
			System.out.println("k có phân tử cần tìm ");
		}
		System.out.println("sắp xếp mảng để tìm max theo cách tăng dần");
		Collections.sort(mangso);
		for (int i = 0; i < n; i++) {
			if (k == mangso.get(i)) {
				timkiem = true;
				vitri = k;
				System.out.println("Phân tử k có xuất hiện trong mảng nha và nó ở vị trí thứ " + i);
			}
		}
		System.out.println(mangso.toString());
		System.out.println("Max = " + mangso.get(n - 1));
		System.out.println("Min = " + mangso.get(0));
		System.out.println("sắp xếp mảng để tìm min nhỏ nhất theo cách giảm dần");
		Collections.sort(mangso, Collections.reverseOrder());
		System.out.println(mangso.toString());
		System.out.println("Min = " + mangso.get(n - 1));
		System.out.println("nhập phần tử để xóa");
		System.out.println("Nhập giá trị phần tử cần xóa:");
		int giaTriXoa = nhap.nextInt();

		// Kiểm tra xem giá trị có tồn tại không trước khi xóa
		if (mangso.contains(giaTriXoa)) {
		    // Xóa tất cả các phần tử có giá trị là giaTriXoa
		    mangso.removeIf(x -> x == giaTriXoa); 
		    System.out.println("Mảng sau khi xóa giá trị " + giaTriXoa + ":");
		    System.out.println(mangso.toString());
		} else {
		    System.out.println("Không có giá trị " + giaTriXoa + " trong mảng để xóa.");
		}
		System.out.println("Nhập vị trí cần chèn (từ 0 đến " + mangso.size() + "):");
		int vitrichen = nhap.nextInt();

		// Kiểm tra vị trí hợp lệ
		if (vitrichen >= 0 && vitrichen <= mangso.size()) {
		    System.out.println("Nhập phần tử cần chèn:");
		    int phantuchen = nhap.nextInt();
		    mangso.add(vitrichen, phantuchen);
		    System.out.println("Mảng mới: " + mangso.toString());
		} else {
		    System.out.println("Lỗi: Vị trí " + vitrichen + " không hợp lệ! (Mảng hiện có " + mangso.size() + " phần tử)");
		}
	}
}
