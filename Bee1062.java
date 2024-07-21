import java.util.Scanner;
import java.util.Stack;

public class Bee1062 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int N = scanner.nextInt();
            if (N == 0) break;

            while (true) {
                Stack<Integer> pilhaA = new Stack<>();
                Stack<Integer> estacao = new Stack<>();
                Stack<Integer> pilhaB = new Stack<>();
                
                int x = scanner.nextInt();
                if (x == 0) {
                    System.out.println();
                    break;
                }
                
                pilhaA.push(x);
                pilhaB.push(1);
                
                for (int i = 2; i <= N; ++i) {
                    x = scanner.nextInt();
                    pilhaA.push(x);
                    pilhaB.push(i);
                }
                
                while (!pilhaA.isEmpty() || !estacao.isEmpty() || !pilhaB.isEmpty()) {
                    if (!pilhaA.isEmpty() && !pilhaB.isEmpty() && pilhaA.peek().equals(pilhaB.peek())) {
                        pilhaA.pop();
                        pilhaB.pop();
                    } else if (!estacao.isEmpty() && !pilhaB.isEmpty() && estacao.peek().equals(pilhaB.peek())) {
                        estacao.pop();
                        pilhaB.pop();
                    } else if (!pilhaA.isEmpty()) {
                        estacao.push(pilhaA.pop());
                    } else {
                        break;
                    }
                }
                
                if (pilhaA.isEmpty() && estacao.isEmpty() && pilhaB.isEmpty()) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        scanner.close();
    }
}
