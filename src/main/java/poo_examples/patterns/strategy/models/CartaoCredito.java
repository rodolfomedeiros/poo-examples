package poo_examples.patterns.strategy.models;

/**
 * Dummy credit card class.
 */
public class CartaoCredito {
    private int limite;
    private String numero;
    private String validade;
    private String cvv;
    
    public CartaoCredito(String numero, String validade, String cvv) {
        this.limite = 100_000;
        this.numero = numero;
        this.validade = validade;
        this.cvv = cvv;
    }
    
    public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public int getLimite() {
        return limite;
    }
}