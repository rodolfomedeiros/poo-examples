package poo_examples.generics;

import java.util.List;

// USANDO GENERECIS NA INTERFACE
public interface IClassBO<T> {
	
	//MEU CRUD (create, read, delete, update)
	T criar(T t);
	T atualizar(T t);
	T deletar(T t);
	List<T> listar();
}