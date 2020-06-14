package br.edu.cesmac.si.noticia.model;

import br.edu.cesmac.si.noticia.exception.JornalistaNuloException;

public class Noticia implements Comparable<Noticia> {
	private String titulo;
	private String resumo;
	private String texto;
	private JornalistaAbstract jornalista;
	private Editoria editoria;

	@Override
	public int compareTo(Noticia noticia) {
		return this.getTitulo().compareTo(noticia.getTitulo());
	}

	public Noticia() {

	}

	public Noticia(Jornalista jornalista, Editoria editoria) {
		if (jornalista == null) {
			throw new JornalistaNuloException("Jornalista não pode ser nulo");
		}

		if (editoria == null) {
			throw new JornalistaNuloException("Editoria não pode ser nula");
		}

		this.jornalista = jornalista;
		this.editoria = editoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public JornalistaAbstract getJornalista() {
		return jornalista;
	}

	public void setJornalista(JornalistaAbstract jornalista) {
		this.jornalista = jornalista;
	}

	boolean temJornalista() {
		return jornalista != null;
	}

	public Editoria getEditoria() {
		return editoria;
	}

	public void setEditoria(Editoria editoria) {
		this.editoria = editoria;
	}

	public void mostrarDados() {
		System.out.println("-------Notícia-------");
		System.out.println(titulo);
		/*
		 * System.out.println(resumo); System.out.println(texto);
		 * 
		 * System.out.println(editoria.getNome());
		 */
		/*
		 * if (temJornalista()) { jornalista.mostrarDados(); }
		 */
	}
}
