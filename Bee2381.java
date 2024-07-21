import java.util.LinkedList;
import java.util.Scanner;

public class Bee2381 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tamanhoLista = entrada.nextInt(); 
        int posicaoSorteada = entrada.nextInt();     
        LinkedList<String> alunos = new LinkedList<>(); 
        for (int i = 0; i < tamanhoLista; i++) {
            alunos.add(entrada.next());
        } 
        alunos.sort(String::compareTo);
        String alunoSorteado = alunos.get(posicaoSorteada - 1);
        System.out.println(alunoSorteado);
        
        entrada.close();
    }
}
