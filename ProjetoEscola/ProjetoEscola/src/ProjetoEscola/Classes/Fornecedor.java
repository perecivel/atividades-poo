package ProjetoEscola.Classes;

import java.time.LocalDate;

public class Fornecedor extends BasePessoaJuridica{
    private String servico;
    private LocalDate dataContrato;
    private int periodoEmMes;
    public String getServico() {
        return servico;
    }
    public void setServico(String servico) {
        this.servico = servico;
    }
    public LocalDate getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(LocalDate dataContrato) {
        this.dataContrato = dataContrato;
    }
    public int getPeriodoEmMes() {
        return periodoEmMes;
    }
    public void setPeriodoEmMes(int periodoEmMes) {
        this.periodoEmMes = periodoEmMes;
    }
    public Fornecedor(int codigo, LocalDate dataInsercao, String endereco, String telefone, String nomeFantasia,
            String razaoSocial, String cnpj, String ie, LocalDate dataAbertura, String servico, LocalDate dataContrato,
            int periodoEmMes) {
        super(codigo, dataInsercao, endereco, telefone, nomeFantasia, razaoSocial, cnpj, ie, dataAbertura);
        this.servico = servico;
        this.dataContrato = dataContrato;
        this.periodoEmMes = periodoEmMes;
    }

    @Override
    public void imprimir() {
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Nome Fantasia: " + this.nomeFantasia);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("Razao Social: " + this.razaoSocial);
        System.out.println("CNPJ: " +this.cnpj);
        System.out.println("Inscricao Estadua: " + this.ie);
        System.out.println("Data de Insercao" + this.dataInsercao);
        System.out.println("Data de Abertura: " + this.dataAbertura);
        System.out.println("Servico: " + this.servico);
        System.out.println("Data do Contrato: " + this.dataContrato);
        System.out.println("Periodo em Meses: " + this.dataInsercao);
    } 
}
