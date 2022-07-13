package br.com.frota.util;

import br.com.frota.DAO.MarcaPneuDAO;
import br.com.frota.model.MarcaPneu;

import java.sql.SQLException;
import java.util.List;

public class TesteMarcaPneuDAO {
    static MarcaPneuDAO marcaPneuDAO = new MarcaPneuDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(marcaPneuDAO.count());

        //salvar
        MarcaPneu marcaPneu = new MarcaPneu("teste");
        marcaPneuDAO.insertMarcaPneu(marcaPneu);

        //buscar por ID
        marcaPneu = marcaPneuDAO.selectMarcaPneu(2);
        System.out.println(marcaPneu);

        //Update
        marcaPneu.setDescricao("teste2");
        marcaPneuDAO.updateMarcaPneu(marcaPneu);
        marcaPneu = marcaPneuDAO.selectMarcaPneu(2);
        System.out.println(marcaPneu);

        //Select all
        List<MarcaPneu> marcasPneu = marcaPneuDAO.selectAllMarcasPneu();
        marcasPneu.forEach(System.out::println);

        //Delete
        marcaPneuDAO.deleteMarcaPneu(2);
        marcaPneuDAO.selectAllMarcasPneu().forEach(System.out::println);
    }
}