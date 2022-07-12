package br.com.frota.model;

public class MedicaoBandaVistoria extends GenericModel {
    private float valor;
    private int id_pneu_banda;
    private int id_medicao_vistoria;


    public MedicaoBandaVistoria(Integer id, float valor, int id_pneu_banda, int id_medicao_vistoria) {
        this.valor = valor;
        this.id_pneu_banda = id_pneu_banda;
        this.id_medicao_vistoria = id_medicao_vistoria;
        super.setId(id);
    }

    public float getValor() {
        return valor;
    }

    public int getId_pneu_banda() {
        return id_pneu_banda;
    }

    public int getId_medicao_vistoria() {
        return id_medicao_vistoria;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setId_pneu_banda(int id_pneu_banda) {
        this.id_pneu_banda = id_pneu_banda;
    }

    public void setId_medicao_vistoria(int id_medicao_vistoria) {
        this.id_medicao_vistoria = id_medicao_vistoria;
    }

    @Override
    public String toString() {
        return "MedicaoBandaVistoria {" +
                "id='" + this.getId() + "\'" +
                "valor='" + valor + "\'" +
                "id_pneu_banda='" + id_pneu_banda + "\'" +
                "id_medicao_vistoria='" + id_medicao_vistoria + "\'"+
                '}';
    }
}