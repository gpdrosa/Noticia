package br.edu.cesmac.si.noticia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.edu.cesmac.si.noticia.jdbc.ConnectionFactory;
import br.edu.cesmac.si.noticia.model.Jornalista;

public class JornalistaDAO {

	private Connection connection;

	public JornalistaDAO() {
		this.connection = new ConnectionFactory().getConnection();
	}

	public void inserir(Jornalista jornalista) {
		String sql = "INSERT INTO Jornalista" + " (nome, email, salario)" + " values (?, ?, ?)";

		try {
			PreparedStatement stmt;

			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, jornalista.getNome());
			stmt.setString(2, jornalista.getEmail());
			stmt.setDouble(3, jornalista.getSalario());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void alterar(Jornalista jornalista) {
		String sql = "UPDATE jornalista " + "SET nome = ?, email = ?, salario = ?" + "WHERE idJornalista = ?";

		try {
			PreparedStatement stmt;

			stmt = this.connection.prepareStatement(sql);
			stmt.setString(1, jornalista.getNome());
			stmt.setString(2, jornalista.getEmail());
			stmt.setDouble(3, jornalista.getSalario());
			stmt.setLong(4, jornalista.getId());

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void excluirPorId(Long idJornalista) {
		String sql = "DELETE FROM jornalista " + "WHERE idJornalista = ?";

		try {
			PreparedStatement stmt;

			stmt = this.connection.prepareStatement(sql);
			stmt.setLong(1, idJornalista);

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public List<Jornalista> listarTodas() {
		List<Jornalista> jornalistas = new ArrayList<Jornalista>();

		try {
			String sql = "SELECT idJornalista, nome, email, salario " + " FROM jornalista " + " ORDER BY idJornalista";

			PreparedStatement stmt = this.connection.prepareStatement(sql);
			ResultSet resultado = stmt.executeQuery();

			while (resultado.next()) {
				Long id = resultado.getLong("idJornalista");
				String nome = resultado.getString("nome");
				String email = resultado.getString("email");
				Double salario = resultado.getDouble("salario");

				Jornalista jornalista = new Jornalista();
				jornalista.setId(id);
				jornalista.setNome(nome);
				jornalista.setEmail(email);
				jornalista.setSalario(salario);

				jornalistas.add(jornalista);
			}

			resultado.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

		return jornalistas;
	}
}