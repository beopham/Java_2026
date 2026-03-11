package OOP_Student;

import java.util.ArrayList;

public class QuanLiStudent {
	private ArrayList<Student> sinhvien;

	public QuanLiStudent() {
		this.sinhvien = new ArrayList<Student>();
	}

	public QuanLiStudent(ArrayList<Student> sinhvien) {
		this.sinhvien = sinhvien;
	}
    public void themsinhvien(Student sv)
    {
    	sinhvien.add(sv);
    }
}
