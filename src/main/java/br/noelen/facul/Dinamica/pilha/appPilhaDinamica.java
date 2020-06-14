package br.noelen.facul.Dinamica.pilha;

public class appPilhaDinamica {
    public static void main(String[] args) {
        PilhaDinamica pilha = new PilhaDinamica();

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        System.out.println(pilha.show());

        System.out.println("Valor no Topo: " + pilha.peek());
        

        while(!pilha.isEmpty()){
            System.out.println(pilha.pop().getName());
        }
    }
}