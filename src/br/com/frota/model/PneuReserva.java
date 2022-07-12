package br.com.frota.model;

public class PneuReserva extends GenericModel {

    private String observacao;
    private int id_veiculo;
    private int id_pneu;

    public PneuReserva(String observacao) {
        this.observacao = observacao;
    }

    public PneuReserva(String observacao, Integer id) {
        this.observacao = observacao;
        super.setId(id);
    }

    public String getObservacao() {
        return observacao;
    }
    public int getId_pneu(){ return id_pneu;}
    public int getId_veiculo() { return id_veiculo;}

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "PneuReserva {" +
                "id='" + this.getId() + "\'" +
                "observacao='" + observacao + "\'" +
                "id_veiculo='" + id_veiculo + "\'" +
                "id_pneu='" + id_pneu + "\'" +
                '}';
    }
}