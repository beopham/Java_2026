package OOP_TailIeu;

public class TaiLieu {
		private String maTaiLieu;
		private String tenNXB;
		private int soBanPhatHanh;

		// Constructor rỗng (Default)
		public TaiLieu() {
		}

		// Constructor có tham số
		public TaiLieu(String maTaiLieu, String tenNXB, int soBanPhatHanh) {
			this.maTaiLieu = maTaiLieu;
			this.tenNXB = tenNXB;
			this.soBanPhatHanh = soBanPhatHanh;
		}

		// Getter và Setter
		public String getMaTaiLieu() {
			return maTaiLieu;
		}

		public void setMaTaiLieu(String maTaiLieu) {
			this.maTaiLieu = maTaiLieu;
		}

		public String getTenNXB() {
			return tenNXB;
		}

		public void setTenNXB(String tenNXB) {
			this.tenNXB = tenNXB;
		}

		public int getSoBanPhatHanh() {
			return soBanPhatHanh;
		}

		public void setSoBanPhatHanh(int soBanPhatHanh) {
			this.soBanPhatHanh = soBanPhatHanh;
		}

		public void display() {
			System.out.println("Ma tai lieu: " + maTaiLieu);
			System.out.println("Nha xuat ban: " + tenNXB);
			System.out.println("So ban phat hanh: " + soBanPhatHanh);
		}
	
}
