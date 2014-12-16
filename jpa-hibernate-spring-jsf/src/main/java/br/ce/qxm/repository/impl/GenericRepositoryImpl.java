package br.ce.qxm.repository.impl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import br.ce.qxm.repository.GenericRepository;

@Repository
public class GenericRepositoryImpl<T> implements GenericRepository<T>,
		Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void salvar(T entity) {
		em.persist(entity);

	}

	@Transactional
	public T buscarPorID(Class<T> entidadeClasse, Object id) {

		return em.find(entidadeClasse, id);
	}

	@Transactional
	public T editar(T entity) {
		return em.merge(entity);
	}

	public List<T> listar(Class<T> entidadeClass) {
		CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(entidadeClass));
		return em.createQuery(cq).getResultList();
	}

	@Transactional
	public void deletar(T entidade) {
		em.remove(entidade);

	}

}
