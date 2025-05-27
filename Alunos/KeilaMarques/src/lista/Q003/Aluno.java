
package lista.Q003;

public class Aluno {
    String nome;
    String matricula;
    String curso;
    
    public Aluno() {
        this.nome = "NAO INFORMADO";
        this.matricula = "000000";
        this.curso = "NAO DEFINIDO";
    }

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String toString() {
        return "ALUNO - NOME: " + nome + " - MATRICULA: " + matricula + " - CURSO: " + curso;

    }
    
}
