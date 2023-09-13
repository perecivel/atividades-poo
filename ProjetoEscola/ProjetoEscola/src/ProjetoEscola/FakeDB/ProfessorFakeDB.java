package ProjetoEscola.FakeDB;

import java.time.LocalDate;
import java.util.ArrayList;

import ProjetoEscola.Classes.Professor;

public class ProfessorFakeDB {
    private ArrayList<Professor> tabela;

    public ArrayList<Professor> getTabela() {
        if(this.tabela == null){
            this.tabela = new ArrayList<Professor>();
        }
        return tabela;
    }

    private void CarregarDados(){
        this.tabela = new ArrayList<Professor>();
    }
    public ProfessorFakeDB() {
        this.CarregarDados();

        this.tabela.add(new Professor(1, LocalDate.of(2000, 01 , 01), "rua joao de barro, 123", "9123123", "Joao", "234234", "2342342", LocalDate.of(1987, 12, 04), "1001", "1001", LocalDate.of(2005, 02, 12), LocalDate.of(2014, 12, 07), "01"));
        this.tabela.add(new Professor(2, LocalDate.of(2001, 02 , 02), "rua X, 123", "956756", "Pedro", "67867", "897806", LocalDate.of(1990, 02, 07), "1002", "1002", LocalDate.of(2005, 01, 05), LocalDate.of(2015, 12, 07), "02"));
    }
}
