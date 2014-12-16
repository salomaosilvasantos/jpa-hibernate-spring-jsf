package br.ce.qxm.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name = "autores")
@Entity
public class Autor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nome;

	@OneToMany(mappedBy = "livro", targetEntity = AutorLivro.class, fetch = FetchType.LAZY)
	private List<AutorLivro> autorLivro;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the autorLivro
	 */
	public List<AutorLivro> getAutorLivro() {
		return autorLivro;
	}

	/**
	 * @param autorLivro
	 *            the autorLivro to set
	 */
	public void setAutorLivro(List<AutorLivro> autorLivro) {
		this.autorLivro = autorLivro;
	}

}
