import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Bee1256 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroCasosTeste = scanner.nextInt();
        scanner.nextLine();
        StringBuilder saida = new StringBuilder();
        for (int indiceCaso = 0; indiceCaso < numeroCasosTeste; indiceCaso++) {
            if (indiceCaso > 0) {
                saida.append("\n");
            }
            int numeroEnderecosBase = scanner.nextInt();
            int numeroChaves = scanner.nextInt();
            int[] chaves = new int[numeroChaves];
            for (int i = 0; i < numeroChaves; i++) {
                chaves[i] = scanner.nextInt();
            }
            Map<Integer, List<Integer>> tabelaDispersao = new HashMap<>();
            for (int chave : chaves) {
                int indice = chave % numeroEnderecosBase;
                tabelaDispersao.putIfAbsent(indice, new LinkedList<>());
                tabelaDispersao.get(indice).add(chave);
            }
            for (int i = 0; i < numeroEnderecosBase; i++) {
                saida.append(i).append(" -> ");
                List<Integer> lista = tabelaDispersao.get(i);
                if (lista != null) {
                    for (int chave : lista) {
                        saida.append(chave).append(" -> ");
                    }
                }
                saida.append("\\\n");
            }
        }
        scanner.close();
        System.out.print(saida.toString());
    }
}
