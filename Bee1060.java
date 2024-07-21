import java.util.ArrayList;

public class Bee1060 {
    public static void main(String[] args) {
        ArrayList<Double> valores = new ArrayList<>();
        valores.add(7.0);
        valores.add(-5.0);
        valores.add(-3.4);
        valores.add(4.6);
        valores.add(12.0);
        int quantidadePositivos = contarValoresPositivos(valores);
        System.out.println(quantidadePositivos + " valores positivos");
    }

    public static int contarValoresPositivos(ArrayList<Double> lista) {
        int contagem = 0;
        for (Double valor : lista) {
            if (valor > 0) {
                contagem++;
            }
        }
        return contagem;
    }
}
