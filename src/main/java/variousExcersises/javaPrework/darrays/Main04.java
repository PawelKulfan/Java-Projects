package pl.coderslab.darrays;

public class Main04 {

	public static void main(String[] args) {
		int numbers[] = { 4, 643, 112, 9999, 69};
		int sum_odd = 0;
		for (int i = 0; i < numbers.length; i++) {
			int modulo_even = numbers[i] % 2;
			if (modulo_even == 0) {
				System.out.println(numbers[i]);
			} else {
				System.out.print("");
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			int modulo_odd = numbers[i] % 2;
			if (modulo_odd != 0) {
				sum_odd = sum_odd + numbers[i];
			} else {
				System.out.print("");
			}
		}
		System.out.print("SUMA: " + sum_odd);
	}
}
