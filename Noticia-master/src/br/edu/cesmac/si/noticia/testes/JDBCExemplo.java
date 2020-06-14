package br.edu.cesmac.si.noticia.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.edu.cesmac.si.noticia.jdbc.ConnectionFactory;
import br.edu.cesmac.si.noticia.model.Editoria;

public class JDBCExemplo {

	public static void main(String[] args) {
		ArrayList<Editoria> editorias = new ArrayList<Editoria>();

		try (Connection con = new ConnectionFactory().getConnection()) {
			String sql = "SELECT idEditoria, nome " + " FROM editoria " + " ORDER BY nome";

			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();

			while (resultado.next()) {
				Long id = resultado.getLong("idEditoria");
				String nome = resultado.getString("nome");

				Editoria editoria = new Editoria();
				editoria.setId(id);
				editoria.setNome(nome);

				editorias.add(editoria);
			}

			for (Editoria editoria : editorias) {
				System.out.println("ID " + editoria.getId() + " - " + editoria.getNome());
			}

			resultado.close();
			stmt.close();

		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
