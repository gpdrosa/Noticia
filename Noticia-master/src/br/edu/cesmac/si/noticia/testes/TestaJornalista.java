package br.edu.cesmac.si.noticia.testes;

import br.edu.cesmac.si.noticia.model.Jornalista;
import br.edu.cesmac.si.noticia.model.JornalistaTrainee;
import br.edu.cesmac.si.noticia.model.PlanoDeSaude;

public class TestaJornalista {

	public static void main(String[] args) {
		PlanoDeSaude planoDeSaude = new PlanoDeSaude("SUSMED");
		Jornalista j1 = new Jornalista();
		j1.setNome("Cid Bobeiras");
		j1.setEmail("cidbobeira@nol.com");
		
		Jornalista j2 = new Jornalista();
		j2.setNome("Cid Bobeira");
		j2.setEmail("cidbobeira@nol.com");
	
		System.out.println(j1.equals(j2));
	}
	
}
