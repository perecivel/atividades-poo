package ProjetoEscola.Classes;

import java.time.LocalDate;

public class Professor extends BasePessoaFisica {
    private String registro;
    private String cadeira;

    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getCadeira() {
        return cadeira;
    }
    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
    }
    public Professor(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String registro, String cadeira) {
        super(codigo, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento);
        this.registro = registro;
        this.cadeira = cadeira;
    }
}
