package br.ce.qxm.service;

import java.util.List;

public interface GenericService<T> {
	
	public abstract void salvar(T entidade);

	public abstract T buscarPorID(Class<T> entidadeClasse, Object id);

	public abstract T editar(T entidade);

	public abstract List<T> listar(Class<T> entidadeClasse);

	public abstract void deletar(T entidade);


}
