package br.com.frota.model;

public class MedicaoVistoria extends GenericModel {
    private int raio;
    private String perfil;
    private String largura;
    private String indice_carga;
    private String indice_velocidade;
    private int id_marca_pneu;
    private int id_vistoria;


    public MedicaoVistoria(String perfil, String largura, String indice_carga, String indice_velocidade) {
        this.perfil = perfil;
        this.largura = largura;
        this.indice_carga = indice_carga;
        this.indice_velocidade = indice_velocidade;
    }

    public MedicaoVistoria(Integer id, String perfil, String largura, String indice_carga,
                           String indice_velocidade, int id_marca_pneu, int id_vistoria) {
        this.perfil = perfil;
        this.largura = largura;
        this.indice_carga = indice_carga;
        this.indice_velocidade = indice_velocidade;
        this.id_marca_pneu = id_marca_pneu;
        this.id_vistoria = id_vistoria;
        super.setId(id);
    }


    public int getRaio() {return raio;}
    public String getPerfil() {
        return perfil;
    }
    public String getLargura() {
        return largura;
    }
    public String getIndice_carga() {
        return indice_carga;
    }
    public String getIndice_velocidade() {
        return indice_velocidade;
    }
    public int getId_marca_pneu(){return id_marca_pneu;}
    public int getId_vistoria(){return id_vistoria;}

    public void setPerfil(String perfil) {this.perfil = perfil;}

    public void setId_vistoria(int id_vistoria) {
        this.id_vistoria = id_vistoria;
    }

    public void setId_marca_pneu(int id_marca_pneu) {
        this.id_marca_pneu = id_marca_pneu;
    }

    public void setIndice_carga(String indice_carga) {
        this.indice_carga = indice_carga;
    }

    public void setIndice_velocidade(String indice_velocidade) {
        this.indice_velocidade = indice_velocidade;
    }

    public void setLargura(String largura) {
        this.largura = largura;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    @Override
    public String toString() {
        return "MedicaoVistoria {" +
                "id='" + this.getId() + "\'" +
                "raio='" + raio + "\'" +
                "perfil='" + perfil + "\'" +
                "largura='" + largura + "\'" +
                "indice_carga='" + indice_carga + "\'" +
                "indice_velocidade='" + indice_velocidade + "\'" +
                "id_marca_pneu='" + id_marca_pneu + "\'" +
                "id_vistoria='" + id_vistoria + "\'" +
                '}';
    }
}