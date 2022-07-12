package br.com.frota.model;

public class Eixo extends GenericModel {
    private String descricao;
    private int posicao;
    private int id_tipo_eixo;

    public Eixo(String descricao) {
        this.descricao = descricao;
    }

    public Eixo(Integer id, String descricao, Integer posicao, Integer id_tipo_eixo) {
        this.descricao = descricao;
        this.posicao = posicao;
        this.id_tipo_eixo = id_tipo_eixo;
        super.setId(id);
    }

    public String getDescricao() {
        return descricao;
    }
    public Integer getPosicao(){ return posicao; }
    public Integer getIdTipoEixo() {return id_tipo_eixo;}

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setPosicao (Integer posicao) { this.posicao = posicao;}

    @Override
    public String toString() {
        return "Eixo {" +
                "id='" + this.getId() + "\'" +
                "descricao='" + descricao + "\'" +
                "posicao='" + posicao + "\'" +
                "id_tipo_eixo='" + id_tipo_eixo + "\'" +
                '}';
    }
}