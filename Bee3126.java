import java.util.Scanner;

public class Bee3126 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int C = scanner.nextInt();
		int[] listaPresenca = new int[C];
		for (int i = 0; i < C; i++) {
			listaPresenca[i] = scanner.nextInt();
		}
		int comparecidos = contarComparecidos(listaPresenca);
		System.out.println(comparecidos);
		scanner.close();
	}

	public static int contarComparecidos(int[] listaPresenca) {
		int totalComparecidos = 0;
		for (int presenca : listaPresenca) {
			if (presenca == 1) {
				totalComparecidos++;
			}
		}
		return totalComparecidos;
	}
}
