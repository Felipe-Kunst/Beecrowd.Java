import java.util.Scanner;

public class Bee2760 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] frases = new String[3];
		for (int i = 0; i < 3; i++) {
			frases[i] = sc.nextLine();
		}

		System.out.println(frases[0] + frases[1] + frases[2]);
		System.out.println(frases[1] + frases[2] + frases[0]);
		System.out.println(frases[2] + frases[0] + frases[1]);

		System.out.println(frases[0].substring(0, Math.min(10, frases[0].length()))
				+ frases[1].substring(0, Math.min(10, frases[1].length()))
				+ frases[2].substring(0, Math.min(10, frases[2].length())));
	}
}
