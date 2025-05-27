package lista.wallace.Q07;


public class Funcionario {
    String nome;
    String cpf;
    double salarioBase;
    
    public Funcionario(String nome, String cpf, double salarioBase){
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }
    
    public String getNome() {
    return nome;
}
    
    public double calcularSalario(){
        
        return salarioBase;       
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Salario: " + calcularSalario(); 
    }
}
