package Java_Test.Viet_Tri_Dao_Core;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        // Giả sử nhập 5 phần tử như ví dụ của bạn
        int[] a = new int[5];

        System.out.println("Nhap 5 phan tu:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("--- Cac cap giong nhau tim duoc ---");
        // Chạy đến n-1 thôi nhé
        for (int i = 0; i < 4; i++) {
            // Chỉ cần kiểm tra xem số hiện tại có bằng số tiếp theo không
            if (a[i] == a[i + 1]) {
                System.out.println("Cap giong nhau: (" + a[i] + ", " + a[i + 1] + ")");
            }
        }
        
        sc.close();
	}

}
