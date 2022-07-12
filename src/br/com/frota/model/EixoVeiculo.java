package br.com.frota.model;

public class EixoVeiculo extends GenericModel {

    private int id_veiculo;
    private int id_pneu;
    private int id_eixo;


    public EixoVeiculo(Integer id, Integer id_veiculo, Integer id_pneu, Integer id_eixo) {
        this.id_veiculo = id_veiculo;
        this.id_pneu = id_pneu;
        this.id_eixo = id_eixo;
        super.setId(id);
    }

    public int getId_Veiculo() {
        return id_veiculo;
    }
    public int getId_Pneu() {
        return id_pneu;
    }
    public int getId_Eixo() {
        return id_eixo;
    }

    public void setId_veiculo (int id_veiculo) { this.id_veiculo = id_veiculo;}
    public void setId_pneu (int id_pneu) { this.id_pneu = id_pneu;}
    public void setId_eixo (int id_eixo) { this.id_eixo = id_eixo;}

    @Override
    public String toString() {
        return "EixoVeiculo {" +
                "id='" + this.getId() + "\'" +
                "id_veiculo='" + id_veiculo + "\'" +
                "id_pneu='" + id_pneu + "\'" +
                "id_eixo='" + id_eixo + "\'" +
                '}';
    }
}