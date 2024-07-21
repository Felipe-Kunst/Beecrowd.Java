import java.util.Scanner;

public class Bee1101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        lerEImprimirSequencia(scanner);
    }
    private static void lerEImprimirSequencia(Scanner scanner) {
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        if (m <= 0 || n <= 0) {
            return;
        }
        if (m < n) {
            imprimirSequencia(m, n, m);
        } else {
            imprimirSequencia(n, m, n);
        }
        lerEImprimirSequencia(scanner);
    }
    private static void imprimirSequencia(int menor, int maior, int atual) {
        if (atual <= maior) {
            System.out.print(atual);
            if (atual < maior) {
                System.out.print(" ");
            }
            imprimirSequencia(menor, maior, atual + 1);
        } else {
            int soma = calcularSoma(menor, maior);
            System.out.println(" Sum=" + soma);
        }
    }
    private static int calcularSoma(int menor, int maior) {
        if (menor > maior) {
            return 0;
        }
        return menor + calcularSoma(menor + 1, maior);
    }
}
