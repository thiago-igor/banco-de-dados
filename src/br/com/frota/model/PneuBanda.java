package br.com.frota.model;

public class PneuBanda extends GenericModel {
    private String observacao;
    private int ordem;
    private int id_pneu;
    private int id_banda;


    public PneuBanda(String observacao) {
        this.observacao = observacao;
    }

    public PneuBanda(Integer id, String observacao, int ordem, int id_pneu, int id_banda) {
        this.observacao = observacao;
        this.ordem = ordem;
        this.id_pneu = id_pneu;
        this.id_banda = id_banda;
        super.setId(id);
    }

    public String getObservacao() {
        return observacao;
    }

    public int getId_banda() {
        return id_banda;
    }

    public int getId_pneu() {
        return id_pneu;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public void setId_banda(int id_banda) {
        this.id_banda = id_banda;
    }

    public void setId_pneu(int id_pneu) {
        this.id_pneu = id_pneu;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    @Override
    public String toString() {
        return "PneuBanda {" +
                "id='" + this.getId() + "\'" +
                "observacao='" + observacao + "\'" +
                "ordem='" + ordem + "\'" +
                "id_banda='" + id_banda + "\'" +
                "id_pneu='" + id_pneu + "\'" +
                '}';
    }
}