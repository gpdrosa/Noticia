package br.edu.cesmac.si.noticia.testes;

import java.util.List;

import br.edu.cesmac.si.noticia.dao.EditoriaDAO;
import br.edu.cesmac.si.noticia.model.Editoria;

public class TestaEditoriaDAO {

	public static void main(String[] args) {
		EditoriaDAO editoriaDAO = new EditoriaDAO();
		
		
		List<Editoria> editorias = editoriaDAO.listarTodas();
		

		for (Editoria e : editorias) {
			System.out.println(e.getId() + " - " + e.getNome());
		}
		
		editoriaDAO.excluirPorId(2l);
		editorias = editoriaDAO.listarTodas();
		
		for (Editoria e : editorias) {
			System.out.println(e.getId() + " - " + e.getNome());
		}
	}

}
