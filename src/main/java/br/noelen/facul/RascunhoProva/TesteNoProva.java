package br.noelen.facul.RascunhoProva;

public class TesteNoProva {
   TesteNoProva next;
   int numero;
   public TesteNoProva(int numero){
    this.numero = numero;
    this.next = null;
   }

   public TesteNoProva getNext() {
       return next;
   }

   public void setNext(TesteNoProva next) {
       this.next = next;
   }

   public int getNumero() {
       return numero;
   }

   public void setNumero(int numero) {
       this.numero = numero;
   }

   
}