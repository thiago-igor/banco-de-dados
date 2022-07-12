package br.com.frota.model;

public class VistoriaVeiculo extends GenericModel {
    private String observacao;
    private DateTime data_vistoria;
    private int id_veiculo;
    private String username;


    public VistoriaVeiculo(String observacao) {
        this.observacao = observacao;
    }

    public VistoriaVeiculo(Integer id, String observacao, DateTime data_vistoria, Integer id_veiculo, String username) {
        this.observacao = observacao;
        this.data_vistoria = data_vistoria;
        this.id_veiculo = id_veiculo;
        this.username = username;
        super.setId(id);
    }

    public String getObservacao() {
        return observacao;
    }
    public String getUsername() {return username;}

    public DateTime getData_vistoria() {
        return data_vistoria;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public void setData_vistoria(DateTime data_vistoria) {this.data_vistoria = data_vistoria;}
    public void setId_veiculo(int id_veiculo) {this.id_veiculo = id_veiculo;}
    public void setUsername (String username) {this.username = username;}
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "VistoriaVeiculo {" +
                "id='" + this.getId() + "\'" +
                "observacao='" + observacao + "\'" +
                "username='" + username + "\'" +
                "data_vistoria='" + data_vistoria + "\'" +
                "id_veiculo='" + id_veiculo + "\'" +
                '}';
    }
}