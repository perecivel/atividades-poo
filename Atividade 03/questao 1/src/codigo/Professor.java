package codigo;

import java.time.LocalDate;

public class Professor extends Pessoa {
    private String registro;
    private LocalDate data;
    
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public Professor(int codigo, String nome, String endereco, String telefone, LocalDate data, String rg, String cpf,
            LocalDate dataInsercao, String registro, LocalDate data2) {
        super(codigo, nome, endereco, telefone, data, rg, cpf, dataInsercao);
        this.registro = registro;
        data = data2;
    }
    public Professor() {
    }
    
}
