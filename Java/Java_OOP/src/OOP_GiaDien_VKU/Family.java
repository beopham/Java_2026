package OOP_GiaDien_VKU;

public class Family {
	private String mahogiadinh;
	private Water water;
	private Energy energy;
	private int sochudien;
	private int sochunuoc;

	public Family() {

	}

	public Family(String mahogiadinh, Water water, Energy energy, int sochudien, int sochunuoc) {
		this.mahogiadinh = mahogiadinh;
		this.water = water;
		this.energy = energy;
		this.sochudien = sochudien;
		this.sochunuoc = sochunuoc;
	}

	public String getMahogiadinh() {
		return mahogiadinh;
	}

	public void setMahogiadinh(String mahogiadinh) {
		this.mahogiadinh = mahogiadinh;
	}

	public Water getWater() {
		return water;
	}

	public void setWater(Water water) {
		this.water = water;
	}

	public Energy getEnergy() {
		return energy;
	}

	public void setEnergy(Energy energy) {
		this.energy = energy;
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
    public int Tiendien()
    {
    	int tiendien=getSochudien()*(getEnergy().getGiadien());
    	return tiendien;
    }
    public int Tennuoc()
    {
    	int tiennuoc=getSochunuoc()*(getWater().getGianuoc());
    	return tiennuoc;
    }
	public void hienthi() {
		System.out.println("Mã hộ gia đình : " + getMahogiadinh());
		System.out.println("Mã điện :" + getEnergy().getMadien());
		System.out.println("Giá điện :" + getEnergy().getGiadien());
		System.out.println("Mã nước :" + getWater().getManuoc());
		System.out.println("Giá nước :" + getWater().getGianuoc());
		System.out.println("Số chữ điện :" + getSochudien());
		System.out.println("Số chữ nước :" + getSochunuoc());
		System.out.println("Tiên điện là :" +Tiendien());
		System.out.println("Tiền nước là :" +Tennuoc());
	}
}
