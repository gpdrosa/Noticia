package br.edu.cesmac.si.noticia.model;

public class Revisor implements Avaliador {

    @Override
    public void revisar(Noticia noticia) {
        System.out.println("Um Revisor revisou a notícia");
    }
}
