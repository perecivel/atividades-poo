package ProjetoEscola.Classes;

import java.time.LocalDate;

public class Tecnico extends BaseFuncionario {

    private String setor;

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    

    public Tecnico(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nome, String rg,
            String cpf, LocalDate dataNascimento, String cracha, String registro, LocalDate dataVinculoInicial,
            LocalDate dataVinculoFinal, String cracha2, String setor) {
        super(codigo, dataInsercao, endereco, telefone, nome, rg, cpf, dataNascimento, cracha, registro,
                dataVinculoInicial, dataVinculoFinal);
        cracha = cracha2;
        this.setor = setor;
    }

    @Override
    public void imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " +this.telefone);
        System.out.println("Setor: " + this.setor);
        System.out.println("RG:" + this.rg);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataNascimento);
        System.out.println("Cracha: " + this.cracha);
        System.out.println("Registro: " + this.registro);
        System.out.println("Data de Insercao: " + this.dataInsercao);
        System.out.println("Data de Vinculo Inicial: " + this.dataVinculoInicial);
        System.out.println("Data de Vinculo Final: " + this.dataVinculoFinal);
    }
}
