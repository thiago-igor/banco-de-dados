package br.com.frota.util;

import br.com.frota.DAO.VeiculoDAO;
import br.com.frota.model.Veiculo;

import java.sql.SQLException;
import java.util.List;

public class TesteVeiculoDAO {
    static VeiculoDAO veiculoDAO = new VeiculoDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(veiculoDAO.count());

        //salvar
        Veiculo veiculo = new Veiculo("teste");
        veiculoDAO.insertVeiculo(veiculo);

        //buscar por ID
        veiculo = veiculoDAO.selectVeiculo(2);
        System.out.println(veiculo);

        //Update
        veiculo.setDescricao("teste2");
        veiculoDAO.updateVeiculo(veiculo);
        veiculo = veiculoDAO.selectVeiculo(2);
        System.out.println(veiculo);

        //Select all
        List<Veiculo> Veiculos = veiculoDAO.selectAllVeiculos();
        Veiculos.forEach(System.out::println);

        //Delete
        veiculoDAO.deleteVeiculo(2);
        veiculoDAO.selectAllVeiculos().forEach(System.out::println);
    }
}