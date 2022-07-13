package br.com.frota.util;

import br.com.frota.DAO.EixoDAO;
import br.com.frota.model.Eixo;

import java.sql.SQLException;
import java.util.List;

public class TesteEixoDAO {
    static EixoDAO eixoDAO = new EixoDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(eixoDAO.count());

        //salvar
        Eixo eixo = new Eixo("teste");
        eixoDAO.insertEixo(eixo);

        //buscar por ID
        eixo = eixoDAO.selectEixo(2);
        System.out.println(eixo);

        //Update
        eixo.setDescricao("teste2");
        eixoDAO.updateEixo(eixo);
        eixo = eixoDAO.selectEixo(2);
        System.out.println(eixo);

        //Select all
        List<Eixo> eixos = eixoDAO.selectAllEixos();
        eixos.forEach(System.out::println);

        //Delete
        eixoDAO.deleteEixo(2);
        eixoDAO.selectAllEixos().forEach(System.out::println);
    }
}