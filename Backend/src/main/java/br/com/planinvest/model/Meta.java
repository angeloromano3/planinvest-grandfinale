package br.com.planinvest.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "META")
public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_meta")
    @SequenceGenerator(name = "seq_meta", sequenceName = "SEQ_META", allocationSize = 1)
    @Column(name = "id_meta")
    private Long idMeta;

    @Column(name = "nm_meta")
    private String nmMeta;

    @Column(name = "vl_objeto")
    private Double vlObjeto;

    @Column(name = "vl_acumulado")
    private Double vlAcumulado;

    @Column(name = "dt_inicio")
    private LocalDate dtInicio;

    @Column(name = "dt_prazo")
    private LocalDate dtPrazo;

    @Column(name = "st_meta")
    private String stMeta;

    @Column(name = "ds_meta")
    private String dsMeta;

    @Column(name = "cd_cor")
    private String cdCor;

    @Column(name = "USUARIO_id_usuario")
    private Long usuarioIdUsuario;

    // Getters e Setters
    public Long getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(Long idMeta) {
        this.idMeta = idMeta;
    }

    public String getNmMeta() {
        return nmMeta;
    }

    public void setNmMeta(String nmMeta) {
        this.nmMeta = nmMeta;
    }

    public Double getVlObjeto() {
        return vlObjeto;
    }

    public void setVlObjeto(Double vlObjeto) {
        this.vlObjeto = vlObjeto;
    }

    public Double getVlAcumulado() {
        return vlAcumulado;
    }

    public void setVlAcumulado(Double vlAcumulado) {
        this.vlAcumulado = vlAcumulado;
    }

    public LocalDate getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(LocalDate dtInicio) {
        this.dtInicio = dtInicio;
    }

    public LocalDate getDtPrazo() {
        return dtPrazo;
    }

    public void setDtPrazo(LocalDate dtPrazo) {
        this.dtPrazo = dtPrazo;
    }

    public String getStMeta() {
        return stMeta;
    }

    public void setStMeta(String stMeta) {
        this.stMeta = stMeta;
    }

    public String getDsMeta() {
        return dsMeta;
    }

    public void setDsMeta(String dsMeta) {
        this.dsMeta = dsMeta;
    }

    public String getCdCor() {
        return cdCor;
    }

    public void setCdCor(String cdCor) {
        this.cdCor = cdCor;
    }

    public Long getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Long usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

}