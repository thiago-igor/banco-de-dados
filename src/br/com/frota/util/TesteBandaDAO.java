package br.com.frota.util;

import br.com.frota.DAO.BandaDAO;
import br.com.frota.model.Banda;

import java.sql.SQLException;
import java.util.List;

public class TesteBandaDAO {
    static BandaDAO bandaDAO = new BandaDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(bandaDAO.count());

        //salvar
        Banda banda = new Banda("teste");
        bandaDAO.insertBanda(banda);

        //buscar por ID
        banda = bandaDAO.selectBanda(2);
        System.out.println(bandas);

        //Update
        bandas.setDescricao("teste2");
        bandaDAO.updateBanda(bandas);
        bandas = bandaDAO.selectBanda(2);
        System.out.println(bandas);

        //Select all
        List<Banda> bandas = bandaDAO.selectAllBandas();
        bandas.forEach(System.out::println);

        //Delete
        bandaDAO.deleteBanda(2);
        bandaDAO.selectAllBandas().forEach(System.out::println);
    }
}