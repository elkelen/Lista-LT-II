
package LISTA.questão3;

public class aluno {
    String nome;
    String matricula;
    String curso;

    public aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    
    public aluno() {
        this.nome = "Campo vazio";
        this.matricula = "Campo vazio";
        this.curso = "Campo vazio\n";
    }
    
    void alunopadrao(){
        System.out.println("\nAluno:" +nome);
        System.out.println("Matricula:" +matricula);
        System.out.println("Curso:" +curso);
    }
    
    void alunopreechido(){
        System.out.println("\nAluno:" +nome);
        System.out.println("Matricula:" +matricula);
        System.out.println("Curso:" +curso);
    }
    
    
    
     public static void main(String[] args) {
         aluno a1 = new aluno();
         aluno a2 = new aluno("Kaio","adfasgadgsdf", "info");
         
         System.out.println("Aluno padrão:\n" );
         a1.alunopadrao();
         System.out.println("Aluno cadastrado:\n" );
         a2.alunopreechido();
         
         
     
     
     
     }
    
    
    
}
