package br.com.planinvest.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CONTA")
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_conta")
    @SequenceGenerator(name = "seq_conta", sequenceName = "SEQ_CONTA", allocationSize = 1)
    @Column(name = "id_conta")
    private Long idConta;

    @Column(name = "nr_conta")
    private String nrConta;

    @Column(name = "nm_conta")
    private String nmConta;

    @Column(name = "tp_conta")
    private String tpConta;

    @Column(name = "nm_instituicao")
    private String nmInstituicao;

    @Column(name = "sg_moeda")
    private String sgMoeda;

    @Column(name = "val_saldo_inicial")
    private Double valSaldoInicial;

    @Column(name = "dt_criacao")
    private LocalDate dtCriacao;

    @Column(name = "st_ativa")
    private String stAtiva;

    @Column(name = "USUARIO_id_usuario")
    private Long usuarioIdUsuario;

    public Long getIdConta() { return idConta; }
    public void setIdConta(Long idConta) { this.idConta = idConta; }

    public String getNrConta() { return nrConta; }
    public void setNrConta(String nrConta) { this.nrConta = nrConta; }

    public String getNmConta() { return nmConta; }
    public void setNmConta(String nmConta) { this.nmConta = nmConta; }

    public String getTpConta() { return tpConta; }
    public void setTpConta(String tpConta) { this.tpConta = tpConta; }

    public String getNmInstituicao() { return nmInstituicao; }
    public void setNmInstituicao(String nmInstituicao) { this.nmInstituicao = nmInstituicao; }

    public String getSgMoeda() { return sgMoeda; }
    public void setSgMoeda(String sgMoeda) { this.sgMoeda = sgMoeda; }

    public Double getValSaldoInicial() { return valSaldoInicial; }
    public void setValSaldoInicial(Double valSaldoInicial) { this.valSaldoInicial = valSaldoInicial; }

    public LocalDate getDtCriacao() { return dtCriacao; }
    public void setDtCriacao(LocalDate dtCriacao) { this.dtCriacao = dtCriacao; }

    public String getStAtiva() { return stAtiva; }
    public void setStAtiva(String stAtiva) { this.stAtiva = stAtiva; }

    public Long getUsuarioIdUsuario() { return usuarioIdUsuario; }
    public void setUsuarioIdUsuario(Long usuarioIdUsuario) { this.usuarioIdUsuario = usuarioIdUsuario; }
}