package oop_baitapnhieu_quanlinhanvien_13;

import java.util.ArrayList;

public class Managemnt_Employee {
	private ArrayList<Employee> danhsachnhanvien;

	public Managemnt_Employee() {

		this.danhsachnhanvien = new ArrayList<Employee>();
	}

	public Managemnt_Employee(ArrayList<Employee> danhsachnhanvien) {

		this.danhsachnhanvien = danhsachnhanvien;
	}

	public ArrayList<Employee> getDanhsachnhanvien() {
		return danhsachnhanvien;
	}

	public void setDanhsachnhanvien(ArrayList<Employee> danhsachnhanvien) {
		this.danhsachnhanvien = danhsachnhanvien;
	}

	public void them(Employee emp) {
		danhsachnhanvien.add(emp);
	}

	public void xoa(int id) {
		boolean xoatk = danhsachnhanvien.removeIf(emp -> emp.getId() == id);
		if (xoatk == true) {
			System.out.println("đã xóa thành công");
		} else {
			System.out.println("không xóa được");
		}

	}

	public void timnhanvien_all(int id) {
		for (Employee emp : danhsachnhanvien) {
			if (emp.getId() == id) {
				emp.ShowInfo();
			}
		}
	}

	public void timnhanvien_intern(int id) {
		boolean tk = false;

		for (Employee emp : danhsachnhanvien) {
			if (emp.getId() == id && (emp instanceof Intern it)) {
				it.ShowInfo();
				tk = true;
			}
		}
		if (tk == false) {
			System.out.println("k tìm thấy nhân viên intern mà bạn muốn tìm");
		}
	}

	public void timnhanvien_fresher(int id) {
		boolean tk = false;

		for (Employee emp : danhsachnhanvien) {
			if (emp.getId() == id && (emp instanceof Fresher fr)) {
				fr.ShowInfo();
				tk = true;
			}
		}
		if (tk == false) {
			System.out.println("k tìm thấy nhân viên fresher mà bạn muốn tìm");
		}
	}

	public void timnhanvien_experience(int id) {
		boolean tk = false;

		for (Employee emp : danhsachnhanvien) {
			if (emp.getId() == id && (emp instanceof Experience ex)) {
				ex.ShowInfo();
				tk = true;
			}
		}
		if (tk == false) {
			System.out.println("k tìm thấy nhân viên experience mà bạn muốn tìm");
		}
	}

	public void hienthinhanvien_all() {
		danhsachnhanvien.stream().forEach(x -> x.ShowInfo());
	}

	public void hienthinhanvien_intern() {
		danhsachnhanvien.stream().filter(emp -> emp instanceof Intern).forEach(x -> x.ShowInfo());
	}

	public void hienthinhanvien_experience() {
		danhsachnhanvien.stream().filter(emp -> emp instanceof Experience).forEach(x -> x.ShowInfo());
	}

	public void hienthinhanvien_fresher() {
		danhsachnhanvien.stream().filter(emp -> emp instanceof Fresher).forEach(x -> x.ShowInfo());
	}

	public void demsonhanvienall() {

		Employee.demnhanvien();

	}
}
