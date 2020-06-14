package br.noelen.facul.Estatica.fila;

import br.noelen.facul.Pessoa;

public class FilaCircular {
    private int[] f;
    private int qtd;
    private int tam;
    private int fim;
    private int primeiro;

    public FilaCircular(int max){
        this.tam = max;
        f = new int[tam];
        fim = primeiro = qtd = 0;
    }

    public boolean estaCheia(){
        return (qtd == tam);
    }
    public boolean estaVazia(){
        return(qtd == 0);
    }
    public void push(int number){
        if(!estaCheia()){
            f[fim] = number;
            qtd = qtd + 1;
            fim = fim +1;
        }else{
            fim = 0;
        }

    }
        
    public int pop(){
        if(!estaCheia()){
            int aux = f[inicio];
            qtd--;
            inicio--;

        }else{
            inicio = 0;
        }
        return aux;
    }
}