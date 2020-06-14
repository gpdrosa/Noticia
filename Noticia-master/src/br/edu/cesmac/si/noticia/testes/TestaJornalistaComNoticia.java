package br.edu.cesmac.si.noticia.testes;

import java.util.ArrayList;

import br.edu.cesmac.si.noticia.model.Jornalista;
import br.edu.cesmac.si.noticia.model.Noticia;

public class TestaJornalistaComNoticia {

	public static void main(String[] args) {
		Jornalista jornalista1 = new Jornalista();
	     jornalista1.setNome("Sandney Farias");
	     jornalista1.setEmail("sandney.farias@nol.com.br");

	     ArrayList<Noticia> noticiasJ1 = new ArrayList<>();

	     Noticia n1 = new Noticia();
	     n1.setTitulo("Provocando o caos e a destruição");
	     Noticia n2 = new Noticia();
	     n2.setTitulo("Guerra Mundial Z");

	     noticiasJ1.add(n1);
	     noticiasJ1.add(n2);
	     jornalista1.setNoticias(noticiasJ1);
	     jornalista1.mostrarDados();

	     ArrayList<Noticia> noticiasJ2 = new ArrayList<>();

	     Noticia n3 = new Noticia();
	     n3.setTitulo("Glória a Tim Tones");
	     noticiasJ2.add(n3);
	     
	     Jornalista jornalista2 = new Jornalista();
	       jornalista2.setNome("Tim Tones");
	       jornalista2.setEmail("tim.tones@nol.com.br");
	       jornalista2.setNoticias(noticiasJ2);
	       jornalista2.mostrarDados();
	   }


}
