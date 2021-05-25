package poo_examples.generics;

public class Aparelho<A> {
	A obj;
	
	public Aparelho(A obj) {
		this.obj = obj;
	}
	
	public A getAparelho() {
		return this.obj;
	}
	
	public void setAparelho(A obj) {
		this.obj = obj;
	}
}
