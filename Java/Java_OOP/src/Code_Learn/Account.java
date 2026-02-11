package Code_Learn;

public class Account {
	private int id;
	private String name;
	private int balance;

	public Account() {

	}

	public Account(int id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void hienthi() {
		System.out.println("=== THÔNG TIN TÀI KHOẢN ===");
		System.out.println("ID tài khoản: " + this.id);
		System.out.println("Chủ tài khoản: " + this.name);
		System.out.println("Số dư hiện tại: " + this.balance);
		System.out.println("----------------------------------");
	}

	public void themtien(int tien) {
		if (tien > 0) {
			balance = balance + tien;
			// 2. In ra toàn bộ thông tin tài khoản
			System.out.println("=== THÔNG TIN SAU KHI NẠP TIỀN ===");
			System.out.println("ID tài khoản: " + this.id);
			System.out.println("Chủ tài khoản: " + this.name);
			System.out.println("Số tiền vừa nạp: " + tien);
			System.out.println("Số dư hiện tại: " + this.balance);
			System.out.println("----------------------------------");
		} else {
			System.out.println("Số tiền nạp phải lớn hơn 0!");
		}

	}

	public void ruttien(int tien) {
		if (tien < this.balance) {
			balance = balance - tien;
			System.out.println("=== THÔNG TIN SAU KHI RÚT TIỀN ===");
			System.out.println("ID tài khoản: " + this.id);
			System.out.println("Chủ tài khoản: " + this.name);
			System.out.println("Số tiền vừa rút: " + tien);
			System.out.println("Số dư hiện tại: " + this.balance);
			System.out.println("----------------------------------");
		} else {
			System.out.println("Số tiền rút phải bé hơn tài khoản");
		}
	}
}
