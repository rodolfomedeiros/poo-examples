package poo_examples.javafx.model;

public class Projeto {

	private final String nome;
	private final String descricao;
	
	public Projeto(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return "Projeto [nome=" + nome + ", descricao=" + descricao + "]";
	}
}
