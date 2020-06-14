package br.edu.cesmac.si.noticia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.si.noticia.jdbc.ConnectionFactory;
import br.edu.cesmac.si.noticia.model.Editoria;

public class EditoriaDAO {

	private Connection connection;

	public EditoriaDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Editoria editoria) {
		String sql = "INSERT INTO editoria" + 
					" (nome)" + 
				" values (?)";

		try {
			PreparedStatement stmt;

			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, editoria.getNome());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
	
	public void alterar(Editoria editoria) {
		String sql = "UPDATE editoria " + 
					"SET nome = ? " + 
					"WHERE idEditoria = ?";

		try {
			PreparedStatement stmt;

			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, editoria.getNome());
			stmt.setLong(2, editoria.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}	
	
	public void excluirPorId(Long idEditoria) {
		String sql = "DELETE FROM editoria " + 
					"WHERE idEditoria = ?";

		try {
			PreparedStatement stmt;

			stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, idEditoria);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}		
	
	public List<Editoria> listarTodas() {
		List<Editoria> editorias = new ArrayList<Editoria>();

		try {
			String sql = 	"SELECT idEditoria, nome " + 
							" FROM editoria " + 
							" ORDER BY nome";

			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();

			while (resultado.next()) {
				Long id = resultado.getLong("idEditoria");
				String nome = resultado.getString("nome");

				Editoria editoria = new Editoria();
				editoria.setId(id);
				editoria.setNome(nome);

				editorias.add(editoria);
			}

			resultado.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

		return editorias;
	}

}
