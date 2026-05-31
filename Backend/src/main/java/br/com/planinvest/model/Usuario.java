package br.com.planinvest.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    @SequenceGenerator(name = "seq_usuario", sequenceName = "SEQ_USUARIO", allocationSize = 1)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nm_usuario")
    private String nmUsuario;

    @Column(name = "doc_cpf")
    private String docCpf;

    @Column(name = "dt_nascimento")
    private LocalDate dtNascimento;

    @Column(name = "eml_email")
    private String emlEmail;

    @Column(name = "sen_senha")
    private String senSenha;

    @Column(name = "dt_cadastro")
    private LocalDate dtCadastro;

    @Column(name = "sts_ativo")
    private String stsAtivo;

    public Long getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Long idUsuario) { this.idUsuario = idUsuario; }

    public String getNmUsuario() { return nmUsuario; }
    public void setNmUsuario(String nmUsuario) { this.nmUsuario = nmUsuario; }

    public String getDocCpf() { return docCpf; }
    public void setDocCpf(String docCpf) { this.docCpf = docCpf; }

    public LocalDate getDtNascimento() { return dtNascimento; }
    public void setDtNascimento(LocalDate dtNascimento) { this.dtNascimento = dtNascimento; }

    public String getEmlEmail() { return emlEmail; }
    public void setEmlEmail(String emlEmail) { this.emlEmail = emlEmail; }

    public String getSenSenha() { return senSenha; }
    public void setSenSenha(String senSenha) { this.senSenha = senSenha; }

    public LocalDate getDtCadastro() { return dtCadastro; }
    public void setDtCadastro(LocalDate dtCadastro) { this.dtCadastro = dtCadastro; }

    public String getStsAtivo() { return stsAtivo; }
    public void setStsAtivo(String stsAtivo) { this.stsAtivo = stsAtivo; }
}