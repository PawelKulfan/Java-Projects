package pl.coderslab.darrays;

public class Main07 {

	public static void main(String[] args) {
		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		for (int i = 0; i < temps.length; i++) {
			temps[i] = temps[i] * 1.8 + 32;
		}
		double sum1 = 0;
		for (int i = 0; i < temps.length; i++) {
			sum1 = sum1 + temps[i];
		}
		//double rows_sum = temps.length;
		double avg = sum1 / temps.length;
		//String.format( "%,.2f" , avg );
		System.out.printf("%.2f", avg );
	}

}
