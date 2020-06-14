package br.noelen.facul.RascunhoProva;

public class appProvaRascunho {
    public static void main(String[] args) {
        TesteProva teste = new TesteProva();
        teste.adicionar(3);
        teste.adicionar(2);
        teste.adicionar(4);
        teste.adicionar(3);
        teste.adicionar(2);
        teste.adicionar(5);
        System.out.println(teste.menor());
    }
}