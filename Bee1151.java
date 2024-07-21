import java.io.IOException;
import java.util.Scanner;

public class Bee1151 {
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int proximo, anterior = 0, atual = 1;
		if (N == 1) {
			System.out.println(anterior);
		} else if (N > 1) {
			int i = 1;
			FibonacciSequence(N, i, anterior, atual);
		}
	}

	public static void FibonacciSequence(int N, int i, int anterior, int atual) {
		int proximo;
		if (i == N) {
			System.out.println(anterior);
		} else {
			System.out.print(anterior + " ");
			proximo = anterior + atual;
			anterior = atual;
			atual = proximo;
			FibonacciSequence(N, i + 1, anterior, atual);
		}
	}
}
