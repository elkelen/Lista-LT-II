package lista.wallace.Q03;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    
    public Aluno(){
        this.nome = "Desconhecido";
        this.matricula = "0000";
        this.curso = "indefinido";
    }
    
    public Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;     
    }
    
    public void MostarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }
}
