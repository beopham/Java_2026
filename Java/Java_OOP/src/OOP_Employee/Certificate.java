package OOP_Employee;

public class Certificate {
	private String certificatedID;
	private String certificateName;
	private String certificateRank;
	private String certificatedDate;

	public Certificate() {

	}

	public Certificate(String id, String name, String rank, String date) {
		this.certificatedID = id;
		this.certificateName = name;
		this.certificateRank = rank;
		this.certificatedDate = date;
	}

	public String getCertificatedID() {
		return certificatedID;
	}

	public void setCertificatedID(String certificatedID) {
		this.certificatedID = certificatedID;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateRank() {
		return certificateRank;
	}

	public void setCertificateRank(String certificateRank) {
		this.certificateRank = certificateRank;
	}

	public String getCertificatedDate() {
		return certificatedDate;
	}

	public void setCertificatedDate(String certificatedDate) {
		this.certificatedDate = certificatedDate;
	}
	public void display() {
        System.out.println("   + Mã bằng cấp: " + getCertificatedID());
        System.out.println("   + Tên bằng cấp: " + getCertificateName());
        System.out.println("   + Xếp loại: " + getCertificateRank());
        System.out.println("   + Ngày cấp: " + getCertificatedDate());

    }
}
