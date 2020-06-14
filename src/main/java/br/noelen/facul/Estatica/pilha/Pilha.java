package br.noelen.facul.Estatica.pilha;

public class Pilha {
    private int data[];
    int top;

    public Pilha(int size) {
        data = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    // to put data
    public void push(int value) {
        if (isfull())
            return;
        top++;
        data[top] = value;
    }

    // to check the top
    public int peek() {
        return data[top];
    }

    public boolean isfull() {
        return top == (data.length - 1);
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int value = data[top];
        top--;
        return value;
    }

    public int mostrarMenor(){
        if(isEmpty()){
            return -1;
        }else{
	        int menor = data[0];
	        for (int i = 0; i< data.length; i++){
			    if (menor > data[i]){
			    	menor = data[i];
			    }
		    }
	        return menor;
        }
    }
}

