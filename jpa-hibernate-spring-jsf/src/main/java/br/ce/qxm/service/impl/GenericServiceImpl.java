package br.ce.qxm.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ce.qxm.repository.GenericRepository;
import br.ce.qxm.service.GenericService;

@Service
public class GenericServiceImpl<T> implements GenericService<T> {

	@Autowired
	private GenericRepository<T> genericRepository;

	public void salvar(T entidade) {

		this.genericRepository.salvar(entidade);

	}

	public T buscarPorID(Class<T> entidadeClasse, Object id) {

		return this.genericRepository.buscarPorID(entidadeClasse, id);

	}

	public T editar(T entidade) {

		return this.genericRepository.editar(entidade);

	}

	public List<T> listar(Class<T> entidadeClasse) {

		return this.genericRepository.listar(entidadeClasse);

	}

	public void deletar(T entidade) {

		this.genericRepository.deletar(entidade);

	}

}
