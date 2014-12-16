package br.ce.qxm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "livros")
@Entity
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String titulo;
	@ManyToOne
	@JoinColumn(name = "editora_id")
	private Editora editora;
	@OneToMany(mappedBy = "livro", targetEntity = AutorLivro.class, fetch = FetchType.LAZY)
	private List<AutorLivro> autorLivro;

	public Livro() {
		super();
	}
	
	public Livro(String titulo) {
		this.titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Editora getEditora() {
		return editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public List<AutorLivro> getAutorLivro() {
		return autorLivro;
	}

	public void setAutorLivro(List<AutorLivro> autorLivro) {
		this.autorLivro = autorLivro;
	}
	
}
