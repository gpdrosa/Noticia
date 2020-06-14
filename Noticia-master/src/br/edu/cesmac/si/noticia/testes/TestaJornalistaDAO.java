package br.edu.cesmac.si.noticia.testes;

import java.util.List;

import br.edu.cesmac.si.noticia.dao.JornalistaDAO;
import br.edu.cesmac.si.noticia.model.Jornalista;

public class TestaJornalistaDAO {

    public static void main(String[] args) {
        JornalistaDAO jornalistaDAO = new JornalistaDAO();

        Jornalista jornalista = new Jornalista();
        jornalista.setNome("Pedrosa");
        jornalista.setEmail("pedrosa@email.com");
        jornalista.setSalario(2.000);
        jornalista.setId(1l);
        jornalistaDAO.inserir(jornalista);



        List<Jornalista> jornalistas = jornalistaDAO.listarTodas();


        //jornalistaDAO.excluirPorId(1l);

        jornalistas = jornalistaDAO.listarTodas();

        for (Jornalista e : jornalistas) {
            System.out.println(e.getId() + " Nome: " + e.getNome());
            System.out.println(e.getId() + " Email: " + e.getEmail());
            System.out.println(e.getId() + " Salario: " + e.getSalario());
        }
    }

}