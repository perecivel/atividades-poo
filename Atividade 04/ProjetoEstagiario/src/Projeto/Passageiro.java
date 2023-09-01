package Projeto;

import java.time.LocalDate;

public class Passageiro extends BasePessoa {
    private String email;
    private String numeroCartao;
    private String documento;
    private LocalDate dataNascimento;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumeroCartao() {
        return numeroCartao;
    }
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Passageiro(int codigo, String nome, String registro, String usuario, String email, String numeroCartao,
            String documento, LocalDate dataNascimento) {
        super(codigo, nome, registro, usuario);
        this.email = email;
        this.numeroCartao = numeroCartao;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }    
}
