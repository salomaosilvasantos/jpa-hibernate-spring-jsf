package br.ce.qxm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ce.qxm.model.Livro;
import br.ce.qxm.service.LivroService;

@Component
public class LivroController {

	@Autowired
	private LivroService livroService;
	private Livro livro;

	public LivroController() {
		this.livro = new Livro();
	}

	public String salvar() {
		this.livroService.salvar(this.livro);
		return "/livro/listar.xhtml?faces-redirect=true";
	}

	public String editar() {
		this.livroService.editar(this.livro);
		return "/livro/listar.xhtml?faces-redirect=true";
	}

	public String deletar() {
		this.livroService.deletar(this.livro);

		return "/livro/listar.xhtml?faces-redirect=true";

	}

	public List<Livro> getLivros() {
		return this.livroService.listar(Livro.class);
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LivroService getLivroService() {
		return livroService;
	}

	public void setLivroService(LivroService livroService) {
		this.livroService = livroService;
	}

}
