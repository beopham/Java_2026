package QuanLiSinhVien.SinhVien1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLSV {
    private ArrayList<SinhVien> danhsachsinhvien ;

	public QLSV() {
		this.danhsachsinhvien = new ArrayList<SinhVien>();
	}
	public QLSV(ArrayList<SinhVien> danhsachsinhvien) {
		this.danhsachsinhvien = danhsachsinhvien;
	}
    
	
	public void themsinhvien(SinhVien sv)
	{
		danhsachsinhvien.add(sv);
	}
    public void hienthi()
    {
    	for(SinhVien sv : danhsachsinhvien)
    	{
    		sv.display();
    	}
    }
    public void timkiemsvtheoTen(int id)
    {
    	boolean timkiem=false;
    	for(SinhVien sv : danhsachsinhvien)
    	{
    		if(sv.getId()==id)
    		{
    			timkiem=true;
    			sv.display();
    		}
    	}
    	if (!timkiem) {
            System.out.println("Không tìm thấy sinh viên có ID: " + id);
        }
    	
    }
    public void suasinhvientheoID(int id)
    {
    	Scanner nhap=new Scanner(System.in);
    	boolean timkiem=false;
    	for(SinhVien sv : danhsachsinhvien)
    	{
    		if(sv.getId()==id)
    		{
    			
    			System.out.println("--- NHẬP THÔNG TIN SINH VIÊN MỚI ---");

    			System.out.print("Nhập Tên mới: ");
    		    String ten = nhap.nextLine(); // Bây giờ bạn sẽ nhập được tên bình thường

    		    System.out.print("Nhập Tuổi mới: ");
    		    int tuoi = nhap.nextInt();

    		    System.out.print("Nhập GPA mới: ");
    		    Double gpa = nhap.nextDouble();
    		    nhap.nextLine(); // Xóa bộ nhớ đệm để tránh lỗi cho lần nhập sau
    		    sv.setTen(ten);
    		    sv.setTuoi(tuoi);
    		    sv.setGpa(gpa);
    		    sv.display();
    		    System.out.println("=> Đã cập nhật xong!");
    		}
    	}
    }
    public void xoasinhvientheoID(int id) {
        // removeIf sẽ duyệt toàn bộ list, nếu sv.getId() == id thì xóa luôn
        boolean daXoa = danhsachsinhvien.removeIf(sv -> sv.getId() == id);

        if (daXoa) {
            System.out.println("=> Đã xóa sinh viên có ID: " + id);
        } else {
            System.out.println("=> Không tìm thấy sinh viên có ID: " + id + " để xóa.");
        }
    }
    public void sapxepsinhvientheodiemtangdan()
    {
    	danhsachsinhvien.stream().sorted((sv1,sv2)-> Double.compare(sv1.getGpa(), sv2.getGpa()));
    	hienthi();
    }
//    public void laysinhvientren3()
//    {
//    	for(SinhVien sv : danhsachsinhvien)
//    	{
//    		if(sv.getGpa()>3.0)
//    		{
//    			
//    			sv.display();
//    		}
//    	}
//    	danhsachsinhvien.stream().filter(sv->sv.getGpa()>3.0).forEach(sv->sv.display());;
//    }
    public void laysinhvientren3() {
        boolean coSinhVien = false;
        for (SinhVien sv : danhsachsinhvien) {
            if (sv.getGpa() > 3.0) {
                sv.display();
                coSinhVien = true;
            }
        }
        
        if (!coSinhVien) {
            System.out.println("Không có sinh viên nào có GPA > 3.0");
        }
    }
}
