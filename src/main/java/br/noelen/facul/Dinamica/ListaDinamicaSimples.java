package br.noelen.facul.Dinamica;

import br.noelen.facul.Dinamica.Nodes.NodeListaDinamicaSimples;

public class ListaDinamicaSimples {
    private NodeListaDinamicaSimples first;
    private NodeListaDinamicaSimples last;
    public ListaDinamicaSimples(){
        first = null;
        last = null;
    }
    public boolean estaVazio(){
        if(first == null){
            return true;
        }
        return false;
    }
    public void addInicio(String nome) {
        NodeListaDinamicaSimples novoNo = new NodeListaDinamicaSimples(nome);
        if(estaVazio()){
            first = novoNo;
            last = novoNo; 
        }else{
            novoNo.setNext(first);
           // first.setNext(null);
            first = novoNo;
        }
    }

    public void addFinal(String nome){
        NodeListaDinamicaSimples novoNo = new NodeListaDinamicaSimples(nome);
        if(estaVazio()){
            first = novoNo;
            last = novoNo;
        }else{
            last.setNext(novoNo);
            last = novoNo;
        }
    }
    public NodeListaDinamicaSimples removerInicio(){
        if(estaVazio()){
            return null;
        }else{
           NodeListaDinamicaSimples aux = first;
           first = first.getNext();
           if(first == null){
               last = null;
           }
           return aux;
        }
    }
    public NodeListaDinamicaSimples removerFinal(){
        if(estaVazio()){
            return null;
        }else{
            NodeListaDinamicaSimples previous = first;
            while(previous.getNext() != last){
                previous = previous.getNext();
            }
            NodeListaDinamicaSimples removed = last;
            last = previous; 
            previous.setNext(null);
            return removed;
        }
    }
    public String mostrarTodos(){
        if(estaVazio()){
            return "";
        }
        String out = "";
        NodeListaDinamicaSimples aux = first;
        while(aux != null){
            out = out + aux.getDados();
            aux = aux.getNext();
        }
        return out;
    }

    public NodeListaDinamicaSimples removerQualquer(String nome){
        NodeListaDinamicaSimples aux = first;
        NodeListaDinamicaSimples previous = first;
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
    public NodeListaDinamicaSimples procurar(String nome){
        NodeListaDinamicaSimples aux = first;
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
}