import java.util.Scanner;

public class Bee1030 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroCasos = entrada.nextInt();

        for (int casoAtual = 1; casoAtual <= numeroCasos; casoAtual++) {
            int n = entrada.nextInt();
            int k = entrada.nextInt();
            int ultimoSobrevivente = encontrarUltimoSobrevivente(n, k);
            System.out.println("Case " + casoAtual + ": " + ultimoSobrevivente);
        }

        entrada.close();
    }

    static int encontrarUltimoSobrevivente(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (encontrarUltimoSobrevivente(n - 1, k) + k - 1) % n + 1;
        }
    }
}
