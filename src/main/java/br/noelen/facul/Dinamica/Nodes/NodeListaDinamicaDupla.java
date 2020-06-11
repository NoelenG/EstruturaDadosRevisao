package br.noelen.facul.Dinamica.Nodes;

import br.noelen.facul.Pessoa;

public class NodeListaDinamicaDupla {
    private NodeListaDinamicaDupla next;
    private NodeListaDinamicaDupla previous;
    private Pessoa pessoa;
    public NodeListaDinamicaDupla(String nome){
        pessoa = new Pessoa(nome);
        previous = next = null;
    }
   
    public NodeListaDinamicaDupla getNext() {
        return next;
    }

    public void setNext(NodeListaDinamicaDupla no) {
        this.next = no;
    }

    public String getNome(){
        return pessoa.getNome();
    }

    public NodeListaDinamicaDupla getPrevious() {
        return previous;
    }

    public void setPrevious(NodeListaDinamicaDupla no) {
        this.previous = no;
    }
    
}