import java.util.Scanner;

public class Bee1031 {
    public static int calcularUltimaRegiao(int totalRegioes, int salto, int posicaoAtual, int posicaoFinal) {
        if (posicaoAtual >= totalRegioes) return posicaoFinal;
        return calcularUltimaRegiao(totalRegioes, salto, posicaoAtual + 1, (posicaoFinal + salto) % posicaoAtual);
    }

    public static int encontrarSalto(int totalRegioes, int salto) {
        if (calcularUltimaRegiao(totalRegioes, salto, 1, 0) != 11) return encontrarSalto(totalRegioes, salto + 1);
        return salto;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int totalRegioes;
        while ((totalRegioes = entrada.nextInt()) != 0) {
            int salto = encontrarSalto(totalRegioes, 1);
            System.out.println(salto);
        }
        entrada.close();
    }
}
