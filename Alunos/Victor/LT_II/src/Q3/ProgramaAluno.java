package Q3;

public class ProgramaAluno {
    public static void main(String[] args) {
       
        Aluno aluno1 = new Aluno();

        
        Aluno aluno2 = new Aluno("Victor Hugo", "2025001", "Informática");

       
        System.out.println("Dados do Aluno 1:");
        aluno1.mostrarDados();

        System.out.println("Dados do Aluno 2:");
        aluno2.mostrarDados();
    }
}