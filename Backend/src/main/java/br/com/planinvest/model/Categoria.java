package br.com.planinvest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "CATEGORIA")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_categoria")
    @SequenceGenerator(name = "seq_categoria", sequenceName = "SEQ_CATEGORIA", allocationSize = 1)
    @Column(name = "id_categoria")
    private Long idCategoria;

    @Column(name = "nm_categoria")
    private String nmCategoria;

    @Column(name = "tp_categoria")
    private String tpCategoria;

    @Column(name = "ds_categoria")
    private String dsCategoria;

    @Column(name = "cd_cor")
    private String cdCor;

    @Column(name = "flg_predefinida")
    private String flgPredefinida;

    // Getters e Setters
    public Long getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Long idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNmCategoria() {
        return nmCategoria;
    }

    public void setNmCategoria(String nmCategoria) {
        this.nmCategoria = nmCategoria;
    }

    public String getTpCategoria() {
        return tpCategoria;
    }

    public void setTpCategoria(String tpCategoria) {
        this.tpCategoria = tpCategoria;
    }

    public String getDsCategoria() {
        return dsCategoria;
    }

    public void setDsCategoria(String dsCategoria) {
        this.dsCategoria = dsCategoria;
    }

    public String getCdCor() {
        return cdCor;
    }

    public void setCdCor(String cdCor) {
        this.cdCor = cdCor;
    }

    public String getFlgPredefinida() {
        return flgPredefinida;
    }

    public void setFlgPredefinida(String flgPredefinida) {
        this.flgPredefinida = flgPredefinida;
    }

}