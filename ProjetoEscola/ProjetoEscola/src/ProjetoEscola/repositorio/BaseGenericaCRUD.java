package ProjetoEscola.repositorio;

import java.util.ArrayList;

public abstract class BaseGenericaCRUD<TecnicoFakeDB, TDom>{
    
    public abstract void Create(TDom instancia);

    public abstract void Read(int codigo);

    public abstract ArrayList<TDom> ReadAll();

    public abstract void Update(TDom instancia);

    public abstract void Delete(int codigo);
}
