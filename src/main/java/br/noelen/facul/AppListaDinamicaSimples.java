package br.noelen.facul;

import br.noelen.facul.Dinamica.ListaDinamicaSimples;
import br.noelen.facul.Dinamica.Nodes.NodeListaDinamicaSimples;

public class AppListaDinamicaSimples {
    public static void main(String[] args) {
        ListaDinamicaSimples lista = new ListaDinamicaSimples();
        lista.addInicio("Noelen");
        lista.addInicio("Hugo");
        lista.addInicio("Igor");
        System.out.println(lista.mostrarTodos());
        NodeListaDinamicaSimples temp = lista.removerFinal();
        System.out.println("Removeu:" + temp.getNome());
        temp = lista.removerFinal();
        System.out.println("Removeu:" + temp.getNome());
        System.out.println(lista.mostrarTodos());
        
    }
}