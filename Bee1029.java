import java.util.Scanner;

public class Bee1029 {
    static int chamadas = 0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalCasos = entrada.nextInt();
        int casoAtual = 0;
        gerarSequenciaFib(entrada, totalCasos, casoAtual);
        entrada.close();
    }

    static void gerarSequenciaFib(Scanner entrada, int totalCasos, int casoAtual) {
        if (casoAtual < totalCasos) {
            int valor = entrada.nextInt();
            chamadas = 0;
            int resultado = calcularFib(valor);
            System.out.printf("fib(%d) = %d calls = %d%n", valor, chamadas - 1, resultado);
            gerarSequenciaFib(entrada, totalCasos, casoAtual + 1);
        }
    }

    static int calcularFib(int n) {
        chamadas++;
        if (n < 2) {
            return n;
        } else {
            return calcularFib(n - 1) + calcularFib(n - 2);
        }
    }
}
