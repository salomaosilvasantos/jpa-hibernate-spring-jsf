package br.ce.qxm.model;

import java.io.Serializable;

public class AutorLivroId implements Serializable {

	private static final long serialVersionUID = 1L;

	private Autor autor;
	private Livro livro;

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public int hashCode() {
		return autor.hashCode() + livro.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AutorLivroId) {
			AutorLivroId bibliografiaId = (AutorLivroId) obj;
			return bibliografiaId.autor.equals(autor)
					&& bibliografiaId.livro.equals(livro);
		}

		return false;
	}
}
