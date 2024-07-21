import java.util.Scanner;

public class Bee1028 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int casosDeTeste = entrada.nextInt();

        while (casosDeTeste-- > 0) {
            int numero1 = entrada.nextInt();
            int numero2 = entrada.nextInt();

            int mdc = calcularMDC(numero1, numero2);
            System.out.println(mdc);
        }
    }
    
    private static int calcularMDC(int numero1, int numero2) {
        if (numero2 == 0) {
            return numero1;
        }
        return calcularMDC(numero2, numero1 % numero2);
    }
}
