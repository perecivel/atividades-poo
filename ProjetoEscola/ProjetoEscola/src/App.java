import java.time.LocalDate;

import ProjetoEscola.dominio.Aluno;
import ProjetoEscola.repositorio.AlunoRepositorio;

public class App {
    public static void main(String[] args) throws Exception {    
    AlunoRepositorio repo = new AlunoRepositorio();
    System.out.println("### Início de Execução. ###");

        for (Aluno aluno : repo.ReadAll()){
            
            System.out.println("-----------------------------------");
            aluno.imprimir();   
        }

     System.out.println("### Final de Execução. ###");        

    }
}
