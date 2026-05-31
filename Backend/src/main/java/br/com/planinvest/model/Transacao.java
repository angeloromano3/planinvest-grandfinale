package br.com.planinvest.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "TRANSACAO")
public class Transacao {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transacao")
    @SequenceGenerator(name = "seq_transacao", sequenceName = "SEQ_TRANSACAO", allocationSize = 1)
    @Column(name = "id_transacao")
    private Long idTransacao;

    @Column(name = "tp_transacao")
    private String tpTransacao;

    @Column(name = "vl_transacao")
    private Double vlTransacao;

    @Column(name = "dt_efetivacao")
    private LocalDate dtEfetivacao;

    @Column(name = "ds_transacao")
    private String dsTransacao;

    @Column(name = "tp_pagamento")
    private String tpPagamento;

    @Column(name = "flg_recorrente")
    private String flgRecorente;

    @Column(name = "ds_periodo")
    private String dsPeriodo;

    @Column(name = "CONTA_id_conta")
    private Long contaIdConta;

    @Column(name = "CATEGORIA_id_categoria")
    private Long categoriaIdCategoria;

    // Getters e Setters
    public Long getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(Long idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getTpTransacao() {
        return tpTransacao;
    }

    public void setTpTransacao(String tpTransacao) {
        this.tpTransacao = tpTransacao;
    }

    public Double getVlTransacao() {
        return vlTransacao;
    }

    public void setVlTransacao(Double vlTransacao) {
        this.vlTransacao = vlTransacao;
    }

    public LocalDate getDtEfetivacao() {
        return dtEfetivacao;
    }

    public void setDtEfetivacao(LocalDate dtEfetivacao) {
        this.dtEfetivacao = dtEfetivacao;
    }

    public String getDsTransacao() {
        return dsTransacao;
    }

    public void setDsTransacao(String dsTransacao) {
        this.dsTransacao = dsTransacao;
    }

    public String getTpPagamento() {
        return tpPagamento;
    }

    public void setTpPagamento(String tpPagamento) {
        this.tpPagamento = tpPagamento;
    }

    public String getFlgRecorente() {
        return flgRecorente;
    }

    public void setFlgRecorente(String flgRecorente) {
        this.flgRecorente = flgRecorente;
    }

    public String getDsPeriodo() {
        return dsPeriodo;
    }

    public void setDsPeriodo(String dsPeriodo) {
        this.dsPeriodo = dsPeriodo;
    }

    public Long getContaIdConta() {
        return contaIdConta;
    }

    public void setContaIdConta(Long contaIdConta) {
        this.contaIdConta = contaIdConta;
    }

    public Long getCategoriaIdCategoria() {
        return categoriaIdCategoria;
    }

    public void setCategoriaIdCategoria(Long categoriaIdCategoria) {
        this.categoriaIdCategoria = categoriaIdCategoria;
    }
}