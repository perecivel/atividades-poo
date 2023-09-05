package ProjetoEscola.Classes;

import java.time.LocalDate;

public class Tecnico extends BasePessoaFisica {
    private String cracha;
    private String setor;

    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    public Tecnico(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String setor) {
        super(codigo, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento);
        this.cracha = cracha;
        this.setor = setor;
    }
}
