package br.noelen.facul.RascunhoProva;

public class TesteProva {
    TesteNoProva first;
    public TesteProva() {
        first = null;
    }
    public void adicionar(int numero){
        TesteNoProva novoNo = new TesteNoProva(numero);
        if(first == null){
            first = novoNo;
        }else{
            novoNo.setNext(first);
            first = novoNo;
        }
    }
    public int menor(){
        if(first == null){
            return 0;
        }
        TesteNoProva aux = first;
        int menorValor = first.getNumero();
        while(aux != null){
            if(aux.getNumero() < menorValor){
                menorValor = aux.getNumero();
            }
            aux = aux.getNext();
        }
        return menorValor;
    }

}