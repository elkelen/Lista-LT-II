package Q3;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;

    
    public Aluno() {
        this.nome = "Ancelmo";
        this.matricula = "11";
        this.curso = "Aviação";
    }

    
    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso);
        System.out.println("------------------------");
    }
}