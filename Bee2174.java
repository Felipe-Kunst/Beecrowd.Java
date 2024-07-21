import java.util.*;

public class Bee2174 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capturados = scanner.nextInt();
        scanner.nextLine();

        Set<String> pomekonsCapturados = new HashSet<>();
        for (int i = 0; i < capturados; i++) {
            String pomekon = scanner.nextLine();
            pomekonsCapturados.add(pomekon);
        }

        int faltantes = 151 - pomekonsCapturados.size();
        System.out.println("Falta(m) " + faltantes + " pomekon(s).");

        scanner.close();
    }
}