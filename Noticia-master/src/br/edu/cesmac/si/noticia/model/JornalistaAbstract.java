package br.edu.cesmac.si.noticia.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public abstract class JornalistaAbstract {

	protected String nome;
	protected String email;
	protected double salario;
	protected ArrayList<Noticia> noticias = new ArrayList<>();
	

	public JornalistaAbstract() {
	}
	
	

	public JornalistaAbstract(String nome, String email, double salario) {
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public ArrayList<Noticia> getNoticias() {
		return noticias;
	}

	public void setNoticias(ArrayList<Noticia> noticias) {
		this.noticias = noticias;
	}

	public void mostrarDados() {
		System.out.println("------- Jornalista-------");
		System.out.println(nome);
		System.out.println(email);
		System.out.println(salario);

		if (temNoticias()) {
			Collections.sort(noticias);
			
			for (Noticia noticia : noticias) {
				noticia.mostrarDados();
			}
		}
	}

	private boolean temNoticias() {
		return (this.noticias != null && this.noticias.size() > 0);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(email, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JornalistaAbstract other = (JornalistaAbstract) obj;
		return Objects.equals(email, other.email) && Objects.equals(nome, other.nome);
	}

}
