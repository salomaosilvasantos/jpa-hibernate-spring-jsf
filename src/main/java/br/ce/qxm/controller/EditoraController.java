package br.ce.qxm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.ce.qxm.model.Editora;
import br.ce.qxm.service.EditoraService;

@Component
public class EditoraController {

	@Autowired
	private EditoraService editoraService;

	public void salvar() {
		this.editoraService.salvar(new Editora("teste"));
	}

	/**
	 * @return the editoras
	 */
	public List<Editora> getEditoras() {
		return this.editoraService.listar(Editora.class);
	}

	/**
	 * @return the editoraService
	 */
	public EditoraService getEditoraService() {
		return editoraService;
	}

	/**
	 * @param editoraService
	 *            the editoraService to set
	 */
	public void setEditoraService(EditoraService editoraService) {
		this.editoraService = editoraService;
	}

}
