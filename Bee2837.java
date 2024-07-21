import java.util.Scanner;

public class Bee2837 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade = entrada.nextInt();
        int limiteInferior = entrada.nextInt();
        int limiteSuperior = entrada.nextInt();

        int[] valores = new int[quantidade];
        int[] marcacoes = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            valores[i] = entrada.nextInt();
        }
        for (int i = 0; i < quantidade; i++) {
            marcacoes[i] = entrada.nextInt();
        }
        int resultado = resolver(quantidade, limiteInferior, limiteSuperior, valores, marcacoes);
        System.out.println(resultado);
        entrada.close();
    }

    public static int resolver(int quantidade, int limiteInferior, int limiteSuperior, int[] valores, int[] marcacoes) {
        int resultado = Integer.MIN_VALUE;
        for (int i = 0; i < quantidade; i++) {
            int soma = 0;
            int contagemMarcacoes = 0;

            for (int j = i; j < quantidade; j++) {
                soma += valores[j];
                contagemMarcacoes += marcacoes[j];

                if (contagemMarcacoes >= limiteInferior && contagemMarcacoes <= limiteSuperior) {
                    resultado = Math.max(resultado, soma);
                } else if (contagemMarcacoes > limiteSuperior) {
                    break;
                }
            }
        }
        return resultado;
    }
}
