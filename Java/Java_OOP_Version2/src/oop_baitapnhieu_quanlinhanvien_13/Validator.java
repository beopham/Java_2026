package oop_baitapnhieu_quanlinhanvien_13;

public class Validator {
	public static void checkEmail(String email) throws EmailException {
		String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
		if (email.isEmpty() || !email.matches(regex)) {
			throw new EmailException("Email không đúng định dạng");
		}
	}

	public static void PhoneException(String phone) throws PhoneException {
		String regex = "^0\\d{9}$";
		if (phone.isEmpty() || !phone.matches(regex)) {
			throw new PhoneException("Số điện thoại không đúng định dạng");
		}
	}

	public static void BirthDayException(String date) throws BirthDayException {
		String regex = "^\\d{2}/\\d{2}/\\d{4}$";
		if (date.isEmpty() || !date.matches(regex)) {
			throw new BirthDayException("Ngày sinh không đúng định dạng");
		}

	}

	public static void FullNameException(String name) throws FullNameException {
		String regex = "^[a-zA-Z\\s]+$";
		if (name.isEmpty() || !name.matches(regex)) {
			throw new FullNameException("Tên không đúng định dạng");
		}
	}

	public static void IdException(String sdth) throws IdException {
	    String regex = "^\\d+$";
	    
	    // 1. Kiểm tra xem có phải là số không TRƯỚC
	    if (sdth.isEmpty() || !sdth.matches(regex)) {
	        throw new IdException("ID không đúng định dạng (phải là các chữ số)!");
	    }

	    // 2. Sau khi chắc chắn là số rồi mới ép kiểu để check số âm
	    try {
	        int id = Integer.parseInt(sdth);
	        if (id <= 0) {
	            throw new IdException("ID phải là số dương lớn hơn 0!");
	        }
	    } catch (NumberFormatException e) {
	        // Phòng trường hợp số quá lớn vượt quá kiểu int
	        throw new IdException("ID quá lớn hoặc không hợp lệ!");
	    }
	}
}
