package br.com.planinvest.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ENDERECO")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
    @SequenceGenerator(name = "seq_endereco", sequenceName = "SEQ_ENDERECO", allocationSize = 1)
    @Column(name = "id_endereco")
    private Long idEndereco;

    @Column(name = "nm_rua")
    private String nmRua;

    @Column(name = "nr_endereco")
    private Integer nrEndereco;

    @Column(name = "nm_bairro")
    private String nmBairro;

    @Column(name = "nm_cidade")
    private String nmCidade;

    @Column(name = "sg_estado")
    private String sgEstado;

    @Column(name = "cd_cep")
    private String cdCep;

    @Column(name = "ds_complemento")
    private String dsComplemento;

    @Column(name = "st_principal")
    private String stPrincipal;

    @Column(name = "USUARIO_id_usuario")
    private Long usuarioIdUsuario;

    // Getters e Setters
    public Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public String getNmRua() {
        return nmRua;
    }

    public void setNmRua(String nmRua) {
        this.nmRua = nmRua;
    }

    public Integer getNrEndereco() {
        return nrEndereco;
    }

    public void setNrEndereco(Integer nrEndereco) {
        this.nrEndereco = nrEndereco;
    }

    public String getNmBairro() {
        return nmBairro;
    }

    public void setNmBairro(String nmBairro) {
        this.nmBairro = nmBairro;
    }

    public String getNmCidade() {
        return nmCidade;
    }

    public void setNmCidade(String nmCidade) {
        this.nmCidade = nmCidade;
    }

    public String getSgEstado() {
        return sgEstado;
    }

    public void setSgEstado(String sgEstado) {
        this.sgEstado = sgEstado;
    }

    public String getCdCep() {
        return cdCep;
    }

    public void setCdCep(String cdCep) {
        this.cdCep = cdCep;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getStPrincipal() {
        return stPrincipal;
    }

    public void setStPrincipal(String stPrincipal) {
        this.stPrincipal = stPrincipal;
    }

    public Long getUsuarioIdUsuario() {
        return usuarioIdUsuario;
    }

    public void setUsuarioIdUsuario(Long usuarioIdUsuario) {
        this.usuarioIdUsuario = usuarioIdUsuario;
    }

}