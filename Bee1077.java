import java.util.Scanner;
import java.util.Stack;

public class Bee1077 {
    
    public static String infixoParaPosfixo(String infixo) {
        StringBuilder posfixo = new StringBuilder();
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < infixo.length(); i++) {
            char c = infixo.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                posfixo.append(c);
            } else if (c == '(') {
                pilha.push(c);
            } else if (c == ')') {
                while (!pilha.isEmpty() && pilha.peek() != '(') {
                    posfixo.append(pilha.pop());
                }
                pilha.pop();
            } else {
                while (!pilha.isEmpty() && precedencia(c) <= precedencia(pilha.peek())) {
                    posfixo.append(pilha.pop());
                }
                pilha.push(c);
            }
        }
        while (!pilha.isEmpty()) {
            posfixo.append(pilha.pop());
        }
        return posfixo.toString();
    }

    public static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantidadeExpressoes = entrada.nextInt();
        entrada.nextLine();
        for (int i = 0; i < quantidadeExpressoes; i++) {
            String infixo = entrada.nextLine();
            String posfixo = infixoParaPosfixo(infixo);
            System.out.println(posfixo);
        }
        entrada.close();
    }
}
