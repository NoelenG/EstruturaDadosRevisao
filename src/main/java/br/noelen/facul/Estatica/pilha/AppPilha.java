package br.noelen.facul.Estatica.pilha;

public class AppPilha {
    public static void main(String[] args) {
    Pilha stack = new Pilha(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}