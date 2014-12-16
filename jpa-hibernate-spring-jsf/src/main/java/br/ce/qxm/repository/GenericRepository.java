package br.ce.qxm.repository;

import java.util.List;

public interface GenericRepository<T> {

	public abstract void salvar(T entidade);

	public abstract T buscarPorID(Class<T> entidadeClasse, Object id);

	public abstract T editar(T entidade);

	public abstract List<T> listar(Class<T> entidadeClasse);

	public abstract void deletar(T entidade);

	
}
