package br.edu.cesmac.si.noticia.model;

public class Editor extends Jornalista implements Avaliador {

    @Override
    public void revisar(Noticia noticia) {
        System.out.println("Um Editor revisou a notícia");
    }
}
