package br.edu.cesmac.si.noticia.testes;

import br.edu.cesmac.si.noticia.model.Editoria;
import br.edu.cesmac.si.noticia.model.Jornalista;

public class TestaEditoria {

	public static void main(String[] args) {
		String nome = "Sandney";
		
		Editoria editoriaA = new Editoria();
		Editoria editoriaB = new Editoria();
		
		Jornalista j1 = new Jornalista();
		j1.setNome("Sandney");

		editoriaA.setNome("Esportes");
		editoriaB.setNome("Esportes");

		System.out.println(editoriaA.equals(j1));
	}

}
