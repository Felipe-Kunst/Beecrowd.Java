import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Bee3139 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int atual = scanner.nextInt();
		int meta = scanner.nextInt();
		Deque<Integer> deque = new LinkedList<>();

		for (int i = 0; i < 30; i++) {
			deque.addLast(scanner.nextInt());
		}

		int dias = 0;
		while (atual < meta) {
			int media = calcularMedia(deque);
			atual += media;
			dias++;
			deque.removeFirst();
			deque.addLast(media);
		}

		System.out.println(dias);
		scanner.close();
	}

	private static int calcularMedia(Deque<Integer> deque) {
		int soma = 0;
		Deque<Integer> copia = new LinkedList<>(deque);

		while (!copia.isEmpty()) {
			soma += copia.removeFirst();
		}

		return soma / 30;
	}
}
