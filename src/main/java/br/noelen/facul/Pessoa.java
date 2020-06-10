package br.noelen.facul;

public class Pessoa {
    String nome;
    public Pessoa(){
        this.nome = null;
    }
    public Pessoa(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa nome: " + nome + "; ";
    }

    

    
}