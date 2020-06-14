package br.edu.cesmac.si.noticia.testes;

import br.edu.cesmac.si.noticia.model.Jornalista;
import br.edu.cesmac.si.noticia.model.JornalistaTrainee;
import br.edu.cesmac.si.noticia.model.Noticia;

public class TestaNoticia {

    public static void main(String[] args) {
        Jornalista j1 = new Jornalista();
        j1.setNome("Cid Bobeira");

        Noticia n1 = new Noticia();
        n1.setJornalista(j1);

        JornalistaTrainee j2 = new JornalistaTrainee();
        j2.setNome("Trainee Bobeira");

        Noticia n2 = new Noticia();
        n2.setJornalista(j2);
    }

}
