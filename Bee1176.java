import java.util.Scanner;

public class Bee1176 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long[] fib = new long[61];

		fib[0] = 0;
		fib[1] = 1;

		for (int i = 2; i <= 60; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int n = s.nextInt();
			System.out.printf("Fib(%d) = %d\n", n, fib[n]);
		}
	}
}
