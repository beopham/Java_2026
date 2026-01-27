package Code_Lai_Nha;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nhap = new Scanner(System.in);
		System.out.println("Nhập vào số học sinh");
		int hocsinh=nhap.nextInt();
		
		String ten[]=new String[hocsinh];
		double diem[]=new double[hocsinh];
		
		nhap.nextLine();
		for(int i=0;i<hocsinh;i++)
		{
			System.out.println("Nhập vào tên học sinh thứ " +(i+1));
			ten[i]=nhap.nextLine();
			System.out.println("Nhập vào điểm học sinh thứ " +(i+1));
			diem[i]=nhap.nextDouble();
			nhap.nextLine();
		}
		for(int i=0;i<hocsinh;i++)
		{
			System.out.println("Tên học sinh là : " + ten[i] + " điểm học sinh là : " + diem[i]);
		}
		double sum=0;
		for(int i=0;i<hocsinh;i++)
		{
			sum=sum+diem[i];
		}
		System.out.println("Tổng điểm là " +sum);
		double diemtb=0;
		diemtb=sum/hocsinh;
		System.out.println("Điểm trung bình là " + diemtb);
		
		for(int i=0;i<hocsinh;i++)
		{
			if (diem[i] > 8) {
			    System.out.println("Học sinh giỏi: " + ten[i] + " - Điểm: " + diem[i]);
			} else {
			    System.out.println("Học sinh bình thường: " + ten[i] + " - Điểm: " + diem[i]);
			}
		}
		
		
		// tìm ra điểm số cao nhất
		double diemmax=diem[0];
		for(int i=0;i<hocsinh;i++)
		{
			if(diem[i] > diemmax)
			{
				diemmax=diem[i];
			}
		}
		System.out.println("Danh sách học sinh có điểm số cao nhất");
		for(int i=0;i<hocsinh;i++)
		{
			if(diem[i] == diemmax)
			{
				System.out.println("Tên học sinh là : " + ten[i] + " điểm học sinh là : " + diem[i]);	
			}
			
		}
		
	}

}
