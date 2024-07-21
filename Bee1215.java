import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bee1215 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Set<String> dicionario = new TreeSet<>();
        while (entrada.hasNextLine()) {
            String linhaEntrada = entrada.nextLine();
            Matcher comparador = Pattern.compile("[a-zA-Z]+").matcher(linhaEntrada);
            while (comparador.find()) {
                String palavra = comparador.group().toLowerCase();
                dicionario.add(palavra);
            }
        }

        entrada.close();

        for (String palavra : dicionario) {
            System.out.println(palavra);
        }
    }
}
