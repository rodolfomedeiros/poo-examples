package poo_examples.heranca;

public class SacolaCompras {
	public void add(Produto produto) {
		produto.descricao();
	}
	
	public void add(Produto ...produto) {
		
	}
	
	public static void main(String[] args) {
		SacolaCompras sacola = new SacolaCompras();
		
		sacola.add(new Produto());
		sacola.add(new Computador(), new Tv());
	}
}