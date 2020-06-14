package br.noelen.facul.Dinamica;

import br.noelen.facul.Dinamica.Nodes.NodeListaDinamicaDupla;

public class ListaDuplaCircular {
    private NodeListaDinamicaDupla first;
    private NodeListaDinamicaDupla last;
    public  ListaDuplaCircular(){
        this.first = last;
        this.last = first;
    }

    public boolean estaVazio(){
       return(this.first == null);
    }
    public void addInicio(String nome) {
        NodeListaDinamicaDupla novoNo = new NodeListaDinamicaDupla(nome);
        if(estaVazio()){
            first = novoNo;
            last = novoNo; 
        }else{
            first.setPrevious(novoNo);
            novoNo.setNext(first);
            first = novoNo;
            first.setPrevious(last);
        }
    }

    public void addFinal(String nome){
        NodeListaDinamicaDupla novoNo = new NodeListaDinamicaDupla(nome);
        if(estaVazio()){
            first = novoNo;
            last = novoNo;
        }else{
            last.setNext(novoNo);
            novoNo.setPrevious(last);
            last = novoNo;
            last.setNext(first);
        }
    }
    public NodeListaDinamicaDupla removerInicio(){
        NodeListaDinamicaDupla aux = first;
        if(aux == null){
            return null;
        }
        if(aux.getNext() == first){
            last = first = null;
        }else{
            first.getNext().setPrevious(last);
            first = first.getNext();
        }
         return aux;

    }
    public NodeListaDinamicaDupla removerFinal(){
        NodeListaDinamicaDupla removed = last;
        if(first == null){
            return null;
        }
        if(first.getNext() == last){
            first = last = null;
        }else{
            
            last.getPrevious().setNext(first);
            last = last.getPrevious(); 
        } 
        return removed;
    }
    
    public String mostrarTodos(){
        if(estaVazio()){
            return "";
        }
        String out = "";
        NodeListaDinamicaDupla aux = first;
        while(aux != null){
            out = out + aux.getNome();
            aux = aux.getNext();
        }
        return out;
    }

    public NodeListaDinamicaDupla removerQualquer(String nome){
        NodeListaDinamicaDupla aux = first;
        NodeListaDinamicaDupla previous = first;
        while((aux != null) && (!aux.getNome().equals(nome))){
            previous = aux;
            aux = aux.getNext();
        }
        //não achou
        if(aux == null){
            return null;
        }
        //achou no começo
        if(aux == first){
            return removerInicio();
        }
        //achou no ultimo
        if(aux == last){
            return removerFinal();
        }
        previous.setNext(aux.getNext());
        return aux;

    }
    public NodeListaDinamicaDupla procurar(String nome){
        NodeListaDinamicaDupla aux = first;
        while((aux != null) && (!aux.getNome().equals(nome))){
            aux = aux.getNext();
        }
        //não achou
        if(aux == null){
            return null;
        }
        //achou no começo
        if(aux == first){
            return removerInicio();
        }
        //achou no ultimo
        if(aux == last){
            return removerFinal();
        }
        return aux;
    }

    public void mostrarDoComeçoAoFim(){
        System.out.println("List: ");
        NodeListaDinamicaDupla atual =  first;
        while(atual != null){
            System.out.println(atual.getNome()+"");
            atual = atual.getNext();

        }
        System.out.println();
    }

    public void mostrarDoFimAoComeço(){
        System.out.println("Lista inversa: ");
        NodeListaDinamicaDupla atual = last;
        while(atual != null){
            System.out.print(atual.getNome()+"");
            atual = atual.getPrevious();
        }
        System.out.println();
    }
}