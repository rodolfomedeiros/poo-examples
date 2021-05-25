package poo_examples.generics;

public class Main {
	public static void main(String[] args) {
		Tv tv = new Tv(32);
		Radio radio = new Radio(100);
		Aparelho<Tv> apTv = new Aparelho<Tv>(tv);
		Aparelho<Radio> apRadio = new Aparelho<Radio>(radio);
		System.out.println(apTv.getAparelho().getClass());
		System.out.println(apRadio.getAparelho().getClass());
	}
}
