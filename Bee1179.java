import java.util.Scanner;

public class Bee1179 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] par = new int[5];
		int[] impar = new int[5];
		int x, p = 0, i = 0;
		for (int j = 0; j < 15; j++) {
			x = sc.nextInt();
			if (x % 2 == 0) {
				par[p] = x;
				p++;
			} else {
				impar[i] = x;
				i++;
			}
			if (p == 5) {
				p = 0;
				for (int k = 0; k < par.length; k++) {
					System.out.println("par[" + k + "] = " + par[k]);
				}
			}
			if (i == 5) {
				i = 0;
				for (int k = 0; k < impar.length; k++) {
					System.out.println("impar[" + k + "] = " + impar[k]);
				}
			}
		}
		for (int k = 0; k < i; k++) {
			System.out.println("impar[" + k + "] = " + impar[k]);
		}
		for (int k = 0; k < p; k++) {
			System.out.println("par[" + k + "] = " + par[k]);
		}
	}
}
