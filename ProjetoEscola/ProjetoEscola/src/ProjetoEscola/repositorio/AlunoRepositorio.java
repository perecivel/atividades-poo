package ProjetoEscola.repositorio;

import java.util.ArrayList;

import ProjetoEscola.FakeDB.AlunoFakeDB;
import ProjetoEscola.dominio.Aluno;

public class AlunoRepositorio 
extends BaseGenericaCRUD<AlunoFakeDB, Aluno>{

    private AlunoFakeDB db;

    private ArrayList<Aluno> dataset;

    public AlunoRepositorio(){
        this.db = new AlunoFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public void Create(Aluno instancia) {

    }

    @Override
    public void Read(int codigo) {
    }

    @Override
    public ArrayList<Aluno> ReadAll() {
        return this.dataset;
    }

    @Override
    public void Update(Aluno instancia) {

    }

    @Override
    public void Delete(int codigo) {

    }
}
