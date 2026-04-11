package oop_baitapgiuaki_vku;

import java.util.ArrayList;
import java.util.Comparator;

public class Quanlihogiadinh {
	private ArrayList<Family> danhsachhogiadinh;

	public Quanlihogiadinh() {

		this.danhsachhogiadinh = new ArrayList<Family>();
	}

	public Quanlihogiadinh(ArrayList<Family> danhsachhogiadinh) {

		this.danhsachhogiadinh = danhsachhogiadinh;
	}

	public void them(Family giadinh) {
		danhsachhogiadinh.add(giadinh);
	}

	public void hienthiall() {
		danhsachhogiadinh.stream().forEach(x -> x.hienthi());
	}

	public void danhsachgiamdantheogiatiendien() {
		danhsachhogiadinh.stream().sorted(Comparator.comparingInt(Family::tongsotiendien).reversed()).forEach(x -> x.hienthi());
	}
	public void danhsachtangdantheogiatiennuoc() {
		danhsachhogiadinh.stream().sorted(Comparator.comparingInt(Family::tongsotiennuoc)).forEach(x -> x.hienthi());
	}
}
