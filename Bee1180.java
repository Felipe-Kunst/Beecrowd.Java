import java.util.LinkedList;
import java.util.Scanner;

public class Bee1180 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int quantidade = scanner.nextInt();
		LinkedList<Integer> lista = new LinkedList<>();
		for (int i = 0; i < quantidade; i++) {
			int elemento = scanner.nextInt();
			lista.add(elemento);
		}
		int menorValor = lista.get(0);
		int posicaoMenorValor = 0;
		for (int i = 1; i < lista.size(); i++) {
			int valorAtual = lista.get(i);
			if (valorAtual < menorValor) {
				menorValor = valorAtual;
				posicaoMenorValor = i;
			}
		}
		System.out.println("Menor valor: " + menorValor);
		System.out.println("Posicao: " + posicaoMenorValor);
		scanner.close();
	}
}
