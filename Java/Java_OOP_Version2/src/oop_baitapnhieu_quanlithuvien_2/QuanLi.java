package oop_baitapnhieu_quanlithuvien_2;

import java.util.ArrayList;

public class QuanLi {
	private ArrayList<Tailieu> danhsachtailieu;

	public QuanLi() {
		this.danhsachtailieu = new ArrayList<Tailieu>();
	}

	public QuanLi(ArrayList<Tailieu> danhsachtailieu) {
		this.danhsachtailieu = danhsachtailieu;
	}

	public ArrayList<Tailieu> getDanhsachtailieu() {
		return danhsachtailieu;
	}

	public void setDanhsachtailieu(ArrayList<Tailieu> danhsachtailieu) {
		this.danhsachtailieu = danhsachtailieu;
	}

	public void themtailieu(Tailieu tl) {
		danhsachtailieu.add(tl);
	}

	public void xoatl(int matailieu) {
		boolean xoa = danhsachtailieu.removeIf(x -> x.getMatailieu() == matailieu);
		if (xoa == true) {
			System.out.println("Đã xóa thành công");
		} else {
			System.out.println("Chưa xóa được");
		}
	}
	public void hienthiall() {
		danhsachtailieu.stream().forEach(x -> x.hienthi());
	}
	public void hienthitapchi() {
		danhsachtailieu.stream().filter(x->x instanceof Tapchi).forEach(x -> x.hienthi());
	}
	public void hienthisach() {
		danhsachtailieu.stream().filter(x->x instanceof Sach) .forEach(x -> x.hienthi());
	}
	public void hienthibao() {
		danhsachtailieu.stream().filter(x->x instanceof Bao).forEach(x -> x.hienthi());
	}
	public void timkiemtapchi(int matailieu)
	{
		boolean tk=false;
		for (Tailieu tl : getDanhsachtailieu())
		{
			if(tl instanceof Tapchi tc && tl.getMatailieu()==matailieu)
			{
				//Tapchi tc=(Tapchi) tl;
				tc.hienthi();
				tk=true;
			}
		}
		if(tk==false)
		{
			System.out.println("k tìm thấy thông tin của tạp chí");
		}
	}
	public void timkiemsach(int matailieu)
	{
		boolean tk=false;
		for (Tailieu tl : getDanhsachtailieu())
		{
			if(tl instanceof Sach s && tl.getMatailieu()==matailieu)
			{
				//Tapchi tc=(Tapchi) tl;
				s.hienthi();
				tk=true;
			}
		}
		if(tk==false)
		{
			System.out.println("k tìm thấy thông tin của sách");
		}
	}
	public void timkiembao(int matailieu)
	{
		boolean tk=false;
		for (Tailieu tl : getDanhsachtailieu())
		{
			if(tl instanceof Bao bao && tl.getMatailieu()==matailieu)
			{
				//Tapchi tc=(Tapchi) tl;
				bao.hienthi();
				tk=true;
			}
		}
		if(tk==false)
		{
			System.out.println("k tìm thấy thông tin của báo");
		}
		
	}

}
