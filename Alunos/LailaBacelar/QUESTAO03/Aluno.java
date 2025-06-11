package QUESTAO03;
public class Aluno {

    String nome;
    String matricula;
    String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno() {
        this.nome = "Vazio";
        this.matricula = "Vazio";
        this.curso = "Vazio";
    }

    void exibirAlunoPadrao() {
        System.out.println("=== Aluno Padrão ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso + "\n");
    }

    void exibirAlunoCadastrado() {
        System.out.println("=== Aluno Cadastrado ===");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Curso: " + curso + "\n");
    }

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno("Laila", "20221IREINFINT0030", "Informática");

        a1.exibirAlunoPadrao();
        a2.exibirAlunoCadastrado();
    }
}
