package codigo;

import java.time.LocalDate;

public class Pessoa {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private LocalDate data;
    private String rg;
    private String cpf;
    private LocalDate dataInsercao;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataInsercao() {
        return dataInsercao;
    }
    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
    
    public Pessoa(int codigo, String nome, String endereco, String telefone, LocalDate data, String rg, String cpf,
            LocalDate dataInsercao) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.data = data;
        this.rg = rg;
        this.cpf = cpf;
        this.dataInsercao = dataInsercao;
    }

    public Pessoa() {
    }
    
}
