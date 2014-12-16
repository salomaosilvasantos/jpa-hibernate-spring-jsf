package br.ce.qxm.repository.impl;

import org.springframework.stereotype.Repository;

import br.ce.qxm.model.Livro;
import br.ce.qxm.repository.LivroRepository;

@Repository
public class LivroRepositoryImpl extends GenericRepositoryImpl<Livro> implements LivroRepository {

}
