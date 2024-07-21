public class Bee1059 {
    public static void main(String[] args) {
        imprimirNumerosPares(1);
    }

    private static void imprimirNumerosPares(int numero) {
        if (numero <= 100) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
            imprimirNumerosPares(numero + 1);
        }
    }
}
