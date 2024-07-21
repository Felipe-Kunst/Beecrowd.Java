import java.util.Scanner;

class Node {
    int chave;
    Node esquerda, direita;

    public Node(int item) {
        chave = item;
        esquerda = direita = null;
    }
}

class ArvoreBinariaDeBusca {
    Node raiz;

    ArvoreBinariaDeBusca() {
        raiz = null;
    }

    void inserir(int chave) {
        raiz = inserirRecursivamente(raiz, chave);
    }

    Node inserirRecursivamente(Node raiz, int chave) {
        if (raiz == null) {
            raiz = new Node(chave);
            return raiz;
        }
        if (chave < raiz.chave)
            raiz.esquerda = inserirRecursivamente(raiz.esquerda, chave);
        else if (chave > raiz.chave)
            raiz.direita = inserirRecursivamente(raiz.direita, chave);

        return raiz;
    }

    void preOrdem(Node node, StringBuilder sb) {
        if (node == null)
            return;
        if (sb.length() > 0)
            sb.append(" ");
        sb.append(node.chave);
        preOrdem(node.esquerda, sb);
        preOrdem(node.direita, sb);
    }

    void emOrdem(Node node, StringBuilder sb) {
        if (node == null)
            return;
        emOrdem(node.esquerda, sb);
        if (sb.length() > 0)
            sb.append(" ");
        sb.append(node.chave);
        emOrdem(node.direita, sb);
    }

    void posOrdem(Node node, StringBuilder sb) {
        if (node == null)
            return;
        posOrdem(node.esquerda, sb);
        posOrdem(node.direita, sb);
        if (sb.length() > 0)
            sb.append(" ");
        sb.append(node.chave);
    }
}

public class Bee1195 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt();
        for (int t = 1; t <= C; t++) {
            int N = scanner.nextInt();
            ArvoreBinariaDeBusca abb = new ArvoreBinariaDeBusca();
            for (int i = 0; i < N; i++) {
                abb.inserir(scanner.nextInt());
            }

            StringBuilder resultadoPreOrdem = new StringBuilder();
            StringBuilder resultadoEmOrdem = new StringBuilder();
            StringBuilder resultadoPosOrdem = new StringBuilder();

            abb.preOrdem(abb.raiz, resultadoPreOrdem);
            abb.emOrdem(abb.raiz, resultadoEmOrdem);
            abb.posOrdem(abb.raiz, resultadoPosOrdem);

            System.out.println("Case " + t + ":");
            System.out.println("Pre.: " + resultadoPreOrdem);
            System.out.println("In..: " + resultadoEmOrdem);
            System.out.println("Post: " + resultadoPosOrdem);
            System.out.println();
        }
        scanner.close();
    }
}
