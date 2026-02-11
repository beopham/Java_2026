package Abstraction;

public class Baby extends Person {

	private String milk;

	public Baby() {

	}

	/**
	 * @param name
	 * @param tuoi
	 */
	public Baby(String name, int tuoi, String milk) {
		super(name, tuoi);
		this.milk = milk;
	}

	public String getMilk() {
		return milk;
	}

	public void setMilk(String milk) {
		this.milk = milk;
	}

	@Override
	public void display() {
		System.out.println("--- Thông tin em bé ---");
		System.out.println("Tên: " + getName());
		System.out.println("Tuổi: " + getTuoi());
		System.out.println("Loại sữa đang uống: " + this.milk);
	}

	@Override
	public void xe() {
		System.out.println("xe mạnh");

	}

	public static void main(String[] args) {
		Baby embe1 = new Baby("nam", 32, "MILO");
		embe1.display();
		embe1.xe();
		Baby embe2 = new Baby("lan", 33, "TH TRUE MILK") {
			@Override
			public void xe() {
				System.out.println("xe mạnh nhất");

			}
		};
		embe2.display();
		embe2.xe();
	}

}
