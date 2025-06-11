/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao07;

/**
 *
 * @author Maria Antônia
 */
public class Funcionario {
    String nome; 
    String cpf; 
    double salarioBase; 
    
    //construtor 
    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome= nome; 
        this.cpf = cpf; 
        this.salarioBase= salarioBase; 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    // método calcularSalario 
    public double calcularSalario(){
        return salarioBase; 
    }
    
    @Override
    public String toString(){
        return "\nNome: "+nome+"\n"+
                "CPF: "+cpf+"\n"+
                "Salario: "+salarioBase+"\n";             
    }
}
