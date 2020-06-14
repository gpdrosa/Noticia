package br.edu.cesmac.si.noticia.testes;

import br.edu.cesmac.si.noticia.model.Editoria;
import br.edu.cesmac.si.noticia.model.Jornalista;
import br.edu.cesmac.si.noticia.model.Noticia;

public class TestaConstrutor {

	public static void main(String[] args) {
		Jornalista j1 = null;
		Editoria e1 = null;
		
		Noticia n1 = null;
		
		n1 = new Noticia(j1, e1);
		n1.mostrarDados();			
		

	}
	
}
