import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bee1110 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int quantidade = scanner.nextInt();
			if (quantidade == 0)
				break;
			Queue<Integer> fila = new LinkedList<>();
			for (int i = 1; i <= quantidade; i++) {
				fila.add(i);
			}
			System.out.print("Cartas descartadas: ");
			boolean primeiro = true;
			while (fila.size() > 1) {
				if (!primeiro) {
					System.out.print(", ");
				}
				primeiro = false;
				System.out.print(fila.poll());
				int movido = fila.poll();
				fila.add(movido);
			}
			System.out.println();
			System.out.println("Remaining card: " + fila.peek());
		}
		scanner.close();
	}
}
