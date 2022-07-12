package br.com.frota.model;

public class Veiculo extends GenericModel {
    private String descricao;
    private int id_marca;

    public Veiculo(String descricao) {
        this.descricao = descricao;
    }

    public Veiculo(Integer id, String descricao, Integer id_marca) {
        this.descricao = descricao;
        this.id_marca = id_marca;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }
    public Integer getIdMarca(){ return id_marca; }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Veiculo {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + descricao + "\'" +
                "id_marca='" + id_marca + "\'" +
                '}';
    }
}
