/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao03;

/**
 *
 * @author Maria Antônia
 */
public class Aluno {
    String nome; 
    String matricula; 
    String curso; 
    
    // construtor sem parâmetro 
    public Aluno(){
        this.nome= "Inexistente";
        this.matricula = "Inexistente"; 
        this.curso = "Nulo"; 
        
    }
    
    // construtor com parametro 
    public Aluno (String nome, String matricula, String curso){
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
    
    // método para exibir Informações
    public void exibirInformacoes(){
        System.out.println("----- exibindo informacoes -----");
        System.out.println("Nome: "+nome);
        System.out.println("Matricula: "+matricula);
        System.out.println("curso: "+curso);
    }    
    
    
}
