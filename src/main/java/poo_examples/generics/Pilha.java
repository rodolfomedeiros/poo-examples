package poo_examples.generics;

import java.util.Arrays;

public class Pilha<P> {
	P[] pilha = (P[]) new Object[10];
	int contador = -1;
	
	public void push(P elem) {
		this.pilha[++contador] = elem;
	}
	
	public P pop() {
		return this.pilha[contador--];
	}
	
	public boolean isEmpty() {
		return contador == -1;
	}
	
	public boolean isFull() {
		return contador >= 9;
	}
	
	@Override
	public String toString() {
		return "Pilha [pilha=" + Arrays.toString(pilha) + ", contador=" + contador + "]";
	}

	public static void main(String[] args) {
		Pilha<Integer> pilha = new Pilha<Integer>();
		Pilha<Tv> pilhaTv = new Pilha<Tv>();
		
		pilha.push(10);
		pilha.push(350);
		pilha.push(10001);
		System.out.println(pilha.toString());
	
		pilhaTv.push(new Tv(32));
	}
}
