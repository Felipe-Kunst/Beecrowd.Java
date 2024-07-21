import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Bee1548 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int casosDeTeste = scanner.nextInt();
        for (int i = 0; i < casosDeTeste; i++) {
            int numeroDeAlunos = scanner.nextInt();
            Deque<Integer> filaOriginal = new ArrayDeque<>();
            Deque<Integer> filaOrdenada = new ArrayDeque<>();
            for (int j = 0; j < numeroDeAlunos; j++) {
                int nota = scanner.nextInt();
                filaOriginal.addLast(nota);
                filaOrdenada.addLast(nota);
            }
            filaOrdenada = ordenarDecrescente(filaOrdenada);
            int alunosSemTroca = 0;
            while (!filaOriginal.isEmpty()) {
                Integer notaOriginal = filaOriginal.removeFirst();
                Integer notaOrdenada = filaOrdenada.removeFirst();
                if (notaOriginal.equals(notaOrdenada)) {
                    alunosSemTroca++;
                }
            }
            System.out.println(alunosSemTroca);
        }
        scanner.close();
    }    
    private static Deque<Integer> ordenarDecrescente(Deque<Integer> deque) {
        Integer[] array = deque.toArray(new Integer[0]);
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }        
        Deque<Integer> dequeOrdenado = new ArrayDeque<>();
        for (int numero : array) {
            dequeOrdenado.addLast(numero);
        }
        return dequeOrdenado;
    }
}
