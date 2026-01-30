package Trac_Nghiem;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int i = 0; i < 2; i++) {
//		    switch (i) {
//		        case 0:
//		        case 1:
//		            System.out.print("one1");
//		        case 2:
//		            System.out.print("two2");
//		        case 3:
//		            System.out.print("three3 ");
//		    }
//		}
//		System.out.println("done4");
//	}
//		int i = 3, j = -2;
//        i += j;
//        j -= i; // LỖI Ở ĐÂY: Có khoảng trắng giữa dấu '-' và '='
//        System.out.println(i + "," + j);
//		boolean x = false;
//        boolean y = !x; // y sẽ là true vì phủ định của false
//
//        // Lệnh in 1: Sử dụng print (không xuống dòng)
//        // Biểu thức: (!false || false == true) -> (true || false) -> kết quả: true
//        System.out.print(!x || x == y);
//
//        // Lệnh in 2: Tiếp tục in dính liền vào kết quả trước
//        // Biểu thức: (false || false == true) -> (false || false) -> kết quả: false
//        System.out.print(x || x == y);
		char i = 'b';

        switch (i) {
            case 'b': 
                System.out.print("Bi "); 
                break; // Thoát khỏi switch ngay lập tức
            case 'a': 
                System.out.print("Ai "); 
            case 'c': 
                System.out.print("Ci "); 
            default: 
                System.out.print("NotFound ");
        }
	}
}
