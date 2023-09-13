package ProjetoEscola.FakeDB;

import java.time.LocalDate;
import java.util.ArrayList;

import ProjetoEscola.Classes.Fornecedor;

public class FornecedorFakeDB {
    private ArrayList<Fornecedor> tabela;

    public ArrayList<Fornecedor> getTabela() {
        if(this.tabela == null){
            this.tabela = new ArrayList<Fornecedor>();
        }
        return tabela;
    }

    private void CarregarDados(){
        this.tabela = new ArrayList<Fornecedor>();
    }

    public FornecedorFakeDB(ArrayList<Fornecedor> tabela) {
        this.CarregarDados();

        this.tabela.add(new Fornecedor(1, LocalDate.of(2000, 01, 01), "Rua X, 124", "99112312", "Empresa X", "Empresa X Ltda", "12.345.678/0001-00", "0212312", LocalDate.of(2000, 01, 10), "Jardinagem", LocalDate.of(2003,03, 20), 12));
    }


    
}
