import java.util.Scanner;

public class Bee1153 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero = s.nextInt();
		long resultado = calcularFatorial(numero);
		System.out.println(resultado);
	}

	public static long calcularFatorial(int n) {
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * calcularFatorial(n - 1);
	}
}
