import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bee2729 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int quantidade = s.nextInt();
		s.nextLine();
		for (int i = 0; i < quantidade; i++) {
			Set<String> conjunto = new TreeSet<>();
			for (String palavra : s.nextLine().split(" ")) {
				conjunto.add(palavra);
			}
			System.out.println(String.join(" ", conjunto));
		}
		s.close();
	}
}