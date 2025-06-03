/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

/**
 *
 * @author evely
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salarioBase;
    
    public Funcionario(){
        
    }

    public Funcionario(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
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
    
    public double calcularSalario(){
        return getSalarioBase();
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() +
                "\nCPF: " + getCpf() +
                "\nSalario: " + calcularSalario();
    }
}
