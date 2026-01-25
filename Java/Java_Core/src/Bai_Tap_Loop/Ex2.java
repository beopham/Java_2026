package Bai_Tap_Loop;

public class Ex2 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while (i <= 20) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("Sum = " + sum);
	}
}
