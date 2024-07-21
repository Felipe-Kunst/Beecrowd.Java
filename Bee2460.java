import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Bee2460 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidade = scanner.nextInt(); 
        Queue<Integer> fila = new LinkedList<>();
        for (int i = 0; i < quantidade; i++) {
            int identificador = scanner.nextInt();
            fila.add(identificador);
        }
        int removidos = scanner.nextInt();
        for (int i = 0; i < removidos; i++) {
            int identificadorParaRemover = scanner.nextInt();
            removerIdentificador(fila, identificadorParaRemover);
        }
        imprimirFila(fila);
        scanner.close();
    }
    private static void removerIdentificador(Queue<Integer> fila, int identificador) {
        Queue<Integer> filaTemporaria = new LinkedList<>();
        while (!fila.isEmpty()) {
            int atual = fila.poll();
            if (atual != identificador) {
                filaTemporaria.add(atual);
            }
        }
        fila.addAll(filaTemporaria);
    }
    private static void imprimirFila(Queue<Integer> fila) {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia");
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Fila: ");
            for (Integer identificador : fila) {
                sb.append(identificador).append(" ");
            }
            System.out.println(sb.toString().trim());
        }
    }
}
