package br.ce.qxm.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(AutorLivroId.class)
public class AutorLivro {

	@Id
	@ManyToOne
	@JoinColumn(name = "id_livro")
	private Livro livro;

	@Id
	@ManyToOne
	@JoinColumn(name = "id_autor")
	private Autor autor;

	@Column(name = "publicacao")
	@Temporal(TemporalType.DATE)
	private Date publicacao;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Date getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Date publicacao) {
		this.publicacao = publicacao;
	}
	
}
