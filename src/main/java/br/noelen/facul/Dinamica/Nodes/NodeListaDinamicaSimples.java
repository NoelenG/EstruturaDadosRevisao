package br.noelen.facul.Dinamica.Nodes;

import br.noelen.facul.Pessoa;

public class NodeListaDinamicaSimples {
    private NodeListaDinamicaSimples next;
    private Pessoa pessoa;
    public NodeListaDinamicaSimples(String nome){
        pessoa = new Pessoa(nome);
        this.next = null;
    }
   
    public NodeListaDinamicaSimples getNext() {
        return next;
    }

    public void setNext(NodeListaDinamicaSimples next) {
        this.next = next;
    }

    public String getDados(){
        return pessoa.toString();
    }

    public String getNome(){
        return pessoa.getNome();
    }
    
}