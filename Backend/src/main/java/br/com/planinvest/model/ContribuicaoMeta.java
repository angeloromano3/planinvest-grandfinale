package br.com.planinvest.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "CONTRIBUICAO_META")
public class ContribuicaoMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_contribuicao")
    @SequenceGenerator(name = "seq_contribuicao", sequenceName = "SEQ_CONTRIBUICAO", allocationSize = 1)
    @Column(name = "id_contribuicao")
    private Long idContribuicao;

    @Column(name = "id_meta")
    private Long idMeta;

    @Column(name = "id_conta")
    private Long idConta;

    @Column(name = "id_transacao")
    private Long idTransacao;

    @Column(name = "vl_contribuicao")
    private Double vlContribuicao;

    @Column(name = "dt_contribuicao")
    private LocalDate dtContribuicao;

    @Column(name = "ds_observacao")
    private String dsObservacao;

    @Column(name = "CONTA_id_conta")
    private Long contaIdConta;

    @Column(name = "META_id_meta")
    private Long metaIdMeta;

    // Getters e Setters
    public Long getIdContribuicao() {
        return idContribuicao;
    }

    public void setIdContribuicao(Long idContribuicao) {
        this.idContribuicao = idContribuicao;
    }

    public Long getIdMeta() {
        return idMeta;
    }

    public void setIdMeta(Long idMeta) {
        this.idMeta = idMeta;
    }

    public Long getIdConta() {
        return idConta;
    }

    public void setIdConta(Long idConta) {
        this.idConta = idConta;
    }

    public Long getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(Long idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Double getVlContribuicao() {
        return vlContribuicao;
    }

    public void setVlContribuicao(Double vlContribuicao) {
        this.vlContribuicao = vlContribuicao;
    }

    public LocalDate getDtContribuicao() {
        return dtContribuicao;
    }

    public void setDtContribuicao(LocalDate dtContribuicao) {
        this.dtContribuicao = dtContribuicao;
    }

    public String getDsObservacao() {
        return dsObservacao;
    }

    public void setDsObservacao(String dsObservacao) {
        this.dsObservacao = dsObservacao;
    }

    public Long getContaIdConta() {
        return contaIdConta;
    }

    public void setContaIdConta(Long contaIdConta) {
        this.contaIdConta = contaIdConta;
    }

    public Long getMetaIdMeta() {
        return metaIdMeta;
    }

    public void setMetaIdMeta(Long metaIdMeta) {
        this.metaIdMeta = metaIdMeta;
    }

}