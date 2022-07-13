package br.com.frota.util;

import br.com.frota.DAO.PneuDao;
import br.com.frota.model.Pneu;

import java.sql.SQLException;
import java.util.List;

public class TestePneuDAO {
    static PneuDAO pneuDAO = new PneuDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(pneuDao.count());

        //salvar
        Pneu pneu = new Pneu("teste");
        pneuDao.insertPneu(Pneu);

        //buscar por ID
        pneu = pneuDao.selectPneu(2);
        System.out.println(pneus);

        //Update
        pneus.setDescricao("teste2");
        pneuDao.updatePneu(pneus);
        pneus = pneuDao.selectPneu(2);
        System.out.println(pneus);

        //Select all
        List<Pneu> pneus = pneuDao.selectAllpneus();
        pneus.forEach(System.out::println);

        //Delete
        pneuDao.deletePneu(2);
        pneuDao.selectAllpneus().forEach(System.out::println);
    }
}