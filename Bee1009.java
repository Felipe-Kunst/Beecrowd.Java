import java.util.Locale;
import java.util.Scanner;

public class Bee1009 {
	public static void main(String[] agrs) {
		Scanner s = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		String nome = s.next();

		double Salario = s.nextDouble();
		double vendas = s.nextDouble();
		double bonus = (vendas * 15) / 100;

		double x = Salario + bonus;

		System.out.printf("TOTAL = R$ " + String.format("%.2f%n", x));
	}
}

