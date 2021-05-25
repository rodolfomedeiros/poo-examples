package poo_examples.exceptions;

public class LancarException {

	public void metodo() throws MinhaException {
		String c = null;

		if (c == null) {
			//throw new MinhaException();
		}
	}

	public static void main(String[] args) {
		LancarException e = new LancarException();

		try {
			e.metodo();
		} catch (MinhaException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			System.out.println("sempre vai ser executado");
		}
	}
}
