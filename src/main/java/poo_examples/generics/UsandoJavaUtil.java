package poo_examples.generics;

import java.util.ArrayList;
import java.util.List;

public class UsandoJavaUtil {
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<Integer>();
		lista.add(Integer.valueOf(10));
		Integer i = (Integer) lista.listIterator().next();
		System.out.println(i);
	}
}
