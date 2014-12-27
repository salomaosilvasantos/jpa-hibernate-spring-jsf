package br.ce.qxm.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.ce.qxm.model.Editora;
import br.ce.qxm.service.EditoraService;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		EditoraService es = (EditoraService) ctx.getBean("editoraServiceImpl");
		// adiciona editoras
		try {
			es.salvar(new Editora("FTD"));
			es.salvar(new Editora("Melhoramentos"));
			es.salvar(new Editora("Novatec"));
			es.salvar(new Editora("Bookman"));
		} catch (Exception e) {
			System.out.println("Não foi possível realizar a inserção");
		}

		// Busco editora por ID, depois edito os dados desta.
		try {
			Editora editoraEditar = es.buscarPorID(Editora.class, 02);
			editoraEditar.setNome("Editora TESTE");
			es.editar(editoraEditar);
		} catch (Exception e) {
			System.out.println("Não foi possível editar");
		}
		// lista as editoras cadastradas
		for (Editora editora : es.listar(Editora.class)) {
			System.out.println("Livro:" + editora.getNome());
		}
		ctx.close();

	}

}
