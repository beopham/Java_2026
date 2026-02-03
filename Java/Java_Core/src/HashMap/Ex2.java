package HashMap;


import java.util.Scanner;
import java.util.HashMap; // Vẫn cần import cái "cuốn sổ" này
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Nhập mảng và target (giống như trước)
        System.out.print("Nhập số lượng phần tử: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("nums[%d] = ", i);
            nums[i] = sc.nextInt();
        }
        System.out.print("Nhập target: ");
        int target = sc.nextInt();

        // 2. KHỞI TẠO "CUỐN SỔ" HASHMAP
        // Key (Số đã gặp) -> Value (Vị trí của số đó)
        Map<Integer, Integer> soDaGap = new HashMap<>();
        
        int index1 = -1;
        int index2 = -1;
        boolean timThay = false;

        // 3. CHỈ DÙNG 1 VÒNG LẶP DUY NHẤT
        for (int i = 0; i < n; i++) {
            int soHienTai = nums[i];
            int soCanTim = target - soHienTai;

            // Kiểm tra trong "sổ" xem đã từng gặp 'soCanTim' chưa
            if (soDaGap.containsKey(soCanTim)) {
                index1 = soDaGap.get(soCanTim); // Lấy vị trí của số cũ trong sổ
                index2 = i;                     // Vị trí của số hiện tại
                timThay = true;
                break; // Tìm thấy rồi thì nghỉ luôn!
            }

            // Nếu chưa thấy số cần tìm, thì ghi số hiện tại vào sổ để người sau tra
            // "Này sổ ơi, nếu ai tìm số " + soHienTai + " thì bảo họ tôi ở vị trí " + i + " nhé"
            soDaGap.put(soHienTai, i);
        }

        // 4. IN KẾT QUẢ
        if (timThay) {
            System.out.println("Kết quả bằng HashMap: [" + index1 + ", " + index2 + "]");
        } else {
            System.out.println("Không tìm thấy cặp nào.");
        }

        sc.close();
    }
}