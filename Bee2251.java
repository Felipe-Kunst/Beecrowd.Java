import java.util.Scanner;

public class Bee2251 {
    private static int contador;
    private static int testeNumero = 1;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
            int discos = s.nextInt();
            if (discos == 0) {
                break;
            }
            contador = 0;
            hanoi(discos, "A", "B", "C");
            System.out.printf("Teste %d\n\n%d", testeNumero, contador);
            testeNumero++;
        }

        s.close();
    }

    static void hanoi(int discos, String origem, String auxiliar, String destino) {
        if (discos > 0) {
            hanoi(discos - 1, origem, destino, auxiliar); 
            contador++;
            hanoi(discos - 1, auxiliar, origem, destino); 
        }
    }
}
