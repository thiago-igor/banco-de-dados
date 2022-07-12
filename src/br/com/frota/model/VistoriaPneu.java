package br.com.frota.model;

public class VistoriaPneu extends GenericModel {
    private String observacao;
    private DateTime data_cadastro;
    private int id_vistoria_veiculo;
    private int id_pneu;


    public VistoriaPneu(String observacao) {
        this.observacao = observacao;
    }

    public VistoriaPneu(Integer id, String observacao, DateTime data_cadastro, int id_vistoria_veiculo, int id_pneu) {
        this.observacao = observacao;
        this.data_cadastro = data_cadastro;
        this.id_vistoria_veiculo = id_vistoria_veiculo;
        this.id_pneu = id_pneu;
        super.setId(id);
    }

    public String getObservacao() {
        return observacao;
    }

    public DateTime getData_cadastro() {
        return data_cadastro;
    }

    public int getId_vistoria_veiculo() {
        return id_vistoria_veiculo;
    }

    public int getId_pneu(){
        return id_pneu;
    }

    public void setData_cadastro(DateTime data_cadastro) {this.data_cadastro = data_cadastro;}
    public void setId_vistoria_veiculo(int id_vistoria_veiculo) {this.id_vistoria_veiculo = id_vistoria_veiculo;}
    public void setId_pneu(int id_pneu) {this.id_pneu = id_pneu;}
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "VistoriaPneu {" +
                "id='" + this.getId() + "\'" +
                "observacao='" + observacao + "\'" +
                "id_pneu='" + id_pneu + "\'" +
                "data_cadastro='" + data_cadastro + "\'" +
                "id_vistoria_veiculo='" + id_vistoria_veiculo + "\'" +
                '}';
    }
}
