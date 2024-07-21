import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bee1257 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numeroDeCasos = scanner.nextInt();
		scanner.nextLine();
		for (int indiceCaso = 0; indiceCaso < numeroDeCasos; indiceCaso++) {
			int numeroDeLinhas = scanner.nextInt();
			scanner.nextLine();
			int valorHash = 0;
			Map<Integer, Integer> mapaHash = new HashMap<>();
			for (int indiceLinha = 0; indiceLinha < numeroDeLinhas; indiceLinha++) {
				String linha = scanner.nextLine();
				for (int indiceCaractere = 0; indiceCaractere < linha.length(); indiceCaractere++) {
					char caractere = linha.charAt(indiceCaractere);
					int posicaoAlfabeto = caractere - 'A';
					int valor = posicaoAlfabeto + indiceLinha + indiceCaractere;
					mapaHash.put(indiceLinha * 100 + indiceCaractere, valor);
					valorHash += valor;
				}
			}
			System.out.println(valorHash);
		}
		scanner.close();
	}
}
