package poo_examples.generics;

public class QualquerCoisa {

	private int X;
	private int Y;
	
	public <T> T fazerAlgo(T algo) {
		return algo;
	}
	
	public <T> void fazerAlgo2(T algo) {
		System.out.println(algo.getClass());
	}
	
}
