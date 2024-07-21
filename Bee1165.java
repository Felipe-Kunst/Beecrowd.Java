import java.util.Scanner;

public class Bee1165 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (isPrime(numbers[i], 2)) {
				System.out.println(numbers[i] + " eh primo");
			} else {
				System.out.println(numbers[i] + " nao eh primo");
			}
		}
	}

	private static boolean isPrime(int x, int divisor) {
		if (x <= 1) {
			return false;
		}
		if (x == 2) {
			return true;
		}
		if (x % divisor == 0) {
			return false;
		}
		if (divisor * divisor > x) {
			return true;
		}
		return isPrime(x, divisor + 1);
	}
}
