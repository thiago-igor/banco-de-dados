package br.com.frota.model;

public class Pneu extends GenericModel {
    private Integer raio;
    private String perfil;
    private String largura;
    private String indice_carga;
    private String indice_velocidade;
    private int id_marca_pneu;

    public Pneu(String perfil, String largura) {
        this.perfil = perfil;
        this.largura = largura;
    }

    public Pneu(Integer id, String perfil, String largura, String indice_carga,
                String indice_velocidade, int id_marca_pneu) {
        this.perfil = perfil;
        this.largura = largura;
        this.indice_carga = indice_carga;
        this.indice_velocidade = indice_velocidade;
        this.id_marca_pneu = id_marca_pneu;
        super.setId(id);
    }

    public Integer getRaio() {return raio;}
    public String getPerfil() {
        return perfil;
    }
    public String getLargura(){ return largura; }
    public String getIndice_carga() { return indice_carga;}
    public String getIndice_velocidade() { return indice_velocidade;}
    public int getId_marca_pneu() {return id_marca_pneu;}

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    public void setLargura (String largura) { this.largura = largura;}
    public void setIndice_carga (String indice_carga) {this.indice_carga = indice_carga;}
    public void setIndice_velocidade (String indice_velocidade) {this.indice_velocidade = indice_velocidade;}
    public void setRaio(Integer raio) {this.raio = raio;}

    public void setId_marca_pneu(int id_marca_pneu) {
        this.id_marca_pneu = id_marca_pneu;
    }

    @Override
    public String toString() {
        return "Pneu {" +
                "id='" + this.getId() + "\'" +
                "raio='" + raio + "\'" +
                "perfil='" + perfil + "\'" +
                "largura='" + largura + "\'" +
                "indice_carga='" + indice_carga + "\'" +
                "indice_velocidade='" + indice_velocidade + "\'" +
                "id_marca_pneu='" + id_marca_pneu + "\'" +
                '}';
    }
}