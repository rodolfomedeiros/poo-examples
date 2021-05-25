package poo_examples.heranca;

public class Produto {
	private String nome;
	private double preco;
	
	public void descricao() {
		System.out.println("Produto não especificado...");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
