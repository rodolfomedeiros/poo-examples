package poo_examples.interface_abstract;

interface Pesquisa{
	Pesquisa pesquisar();
}

public class Cliente implements Pesquisa {
	
	@Override
	public Cliente pesquisar() {
		//vou pesquisar um cliente
		return new Cliente();
	}
	
	public static void main(String[] args) {
		Cliente c = new Cliente();
		
		c.pesquisar();
	}

}

