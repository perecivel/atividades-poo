import java.time.LocalDate;

import ProjetoEscola.Classes.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
                Aluno a1 = new Aluno(1, 
        LocalDate.now(), 
        "Rua x, 10", 
        "991234567", 
        "Mateus", 
        "321", 
        "123", 
        LocalDate.of(1980, 10, 15), 
        "101", 
        LocalDate.of(2002, 2, 5));

        a1.imprimir();
    }
}
