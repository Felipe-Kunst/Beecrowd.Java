import java.util.ArrayList;

public class Bee1065 {
    public static void main(String[] args) {
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(7);
        valores.add(-5);
        valores.add(6);
        valores.add(-4);
        valores.add(12);
        valores.add(6);

        int quantidadePares = contarValoresPares(valores, 0);
        System.out.println(quantidadePares + " valores pares");
    }

    public static int contarValoresPares(ArrayList<Integer> lista, int indice) {
        if (indice == lista.size()) {
            return 0;
        }
        int valorAtual = lista.get(indice);
        if (valorAtual % 2 == 0) {
            return 1 + contarValoresPares(lista, indice + 1);
        } else {
            return contarValoresPares(lista, indice + 1);
        }
    }
}
