package ProjetoEscola.FakeDB;

import java.time.LocalDate;
import java.util.ArrayList;

import ProjetoEscola.Classes.Tecnico;

public class TecnicoFakeDB {
    private ArrayList<Tecnico> tabela;

    public ArrayList<Tecnico> getTabela() {
        if(this.tabela == null){
            this.tabela = new ArrayList<Tecnico>();
        }
        return tabela;
    }

    private void CarregarDados(){
        this.tabela = new ArrayList<Tecnico>();
    }

    public TecnicoFakeDB() {
        this.CarregarDados();
        this.tabela.add(new Tecnico(01, LocalDate.of(2000, 02, 12), "Rua Y, 231", "9911231", "Mateus", "123123132", "123123123", LocalDate.of(1990, 10, 23),"01", "01001", LocalDate.now(), LocalDate.of(2020, 10, 10), "TI"));
    }
}
