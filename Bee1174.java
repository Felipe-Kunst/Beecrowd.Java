import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class Bee1174 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Stack<Double> stack = new Stack<>();

		for (int i = 0; i < 100; i++) {
			double valor = entrada.nextDouble();
			stack.push(valor);
			if (valor <= 10) {
				System.out.printf("A[%d] = %.1f%n", i, valor);
			}
		}
	}
}
