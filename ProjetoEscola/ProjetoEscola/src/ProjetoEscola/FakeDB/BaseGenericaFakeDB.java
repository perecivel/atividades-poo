package ProjetoEscola.FakeDB;

import java.util.ArrayList;

public abstract class BaseGenericaFakeDB<TDom> {

    protected ArrayList<TDom> tabela;

    // Desing Pattern Singleton
    public ArrayList<TDom> getTabela() {
        if(this.tabela == null){
            this.tabela = new ArrayList<TDom>();
        }
        return tabela;
    }
    
    protected abstract void CarregarDados();

    public BaseGenericaFakeDB(){
        this.CarregarDados();
    }
}
