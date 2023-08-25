package codigo;

import java.time.LocalDate;

public class Aluno extends Pessoa{
    private String matricula;
    private LocalDate data;
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }

    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate data, String rg, String cpf,
            LocalDate dataInsercao, String matricula, LocalDate data2) {
        super(codigo, nome, endereco, telefone, data, rg, cpf, dataInsercao);
        this.matricula = matricula;
        data = data2;
    }

    public Aluno() {
    }
}
