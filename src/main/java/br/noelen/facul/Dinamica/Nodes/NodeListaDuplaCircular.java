package br.noelen.facul.Dinamica.Nodes;

import br.noelen.facul.Pessoa;

public class NodeListaDuplaCircular {
    private NodeListaDuplaCircular next;
    private NodeListaDuplaCircular previous;
    private Pessoa pessoa;
    public NodeListaDuplaCircular(String nome){
        pessoa = new Pessoa(nome);
        this.next = this;
        this.previous = this;
    }
   
    public NodeListaDuplaCircular getNext() {
        return next;
    }

    public void setNext(NodeListaDuplaCircular next) {
        this.next = next;
    }
    
    public NodeListaDuplaCircular getPrevious() {
        return previous;
    }

    public void setPrevious(NodeListaDuplaCircular previous) {
        this.previous = previous;
    }

    public String getDados(){
        return pessoa.toString();
    }

    public String getNome(){
        return pessoa.getNome();
    }
}