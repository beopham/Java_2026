package oop_baitapgiuaki_vku;

public class Family {
	private String mahogd;
	private int sochudien;
	private int sochunuoc;
	private Energy energy;
	private Water water;

	public Family() {

	}

	public Family(String mahogd, int sochudien, int sochunuoc, Energy energy, Water water) {
		this.mahogd = mahogd;
		this.sochudien = sochudien;
		this.sochunuoc = sochunuoc;
		this.energy = energy;
		this.water = water;
	}

	public String getMahogd() {
		return mahogd;
	}

	public void setMahogd(String mahogd) {
		this.mahogd = mahogd;
	}

	public int getSochudien() {
		return sochudien;
	}

	public void setSochudien(int sochudien) {
		this.sochudien = sochudien;
	}

	public int getSochunuoc() {
		return sochunuoc;
	}

	public void setSochunuoc(int sochunuoc) {
		this.sochunuoc = sochunuoc;
	}

	public Energy getEnergy() {
		return energy;
	}

	public void setEnergy(Energy energy) {
		this.energy = energy;
	}

	public Water getWater() {
		return water;
	}

	public void setWater(Water water) {
		this.water = water;
	}

	public void hienthi() {
		System.out.println("Mã hộ gia đình: " + this.getMahogd());
		System.out.println("Số chữ điện: " + this.getSochudien());
		System.out.println("Số chữ nước: " + this.getSochunuoc());
		// Sử dụng phương thức get để lấy dữ liệu thay vì dùng biến trực tiếp
		System.out.println("Mã điện: " + this.getEnergy().getMadien());
		System.out.println("Giá Mã điện: " + this.getEnergy().getGia());
		System.out.println("Mã nước: " + this.getWater().getManuoc());
		System.out.println("Giá Mã nước " + this.getWater().getGia());
		System.out.println("=> Tổng tiền điện: " + this.tongsotiendien() + " VNĐ");
		System.out.println("=> Tổng tiền nước: " + this.tongsotiennuoc() + " VNĐ");
	}

	public int tongsotiendien() {
		int sotiendien;
		sotiendien = getSochudien() * getEnergy().getGia();
		return sotiendien;
	}

	public int tongsotiennuoc() {
		int sotiennuoc;
		sotiennuoc = getSochunuoc() * getWater().getGia();
		return sotiennuoc;
	}
}
