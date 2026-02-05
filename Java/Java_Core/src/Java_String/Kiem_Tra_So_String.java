package Java_String;

import java.util.Scanner;

public class Kiem_Tra_So_String {

	public static boolean kiemtra(String s) {
		try {
			int so = Integer.parseInt(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static String loai_khoang_trang(String s) {

		if (s == null || s.isEmpty()) {
			return "";
		}
		String ketqua = s.trim();
		return ketqua;
	}

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào dãy string");
		String day_chu = nhap.nextLine();

	    String chu_final=loai_khoang_trang(day_chu);
	    System.out.println(chu_final);
		if (kiemtra(chu_final)) {
			System.out.println("daay là số");
		} else {
			System.out.println("đâ7y là chữ");
		}
	}

}
