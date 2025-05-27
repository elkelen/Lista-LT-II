package lista.wallace.Q09;

import lista.wallace.Q09.Imprimivel;

public class Funcionario implements  Imprimivel  {
    String nome;
    double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public void imprimir() {
         System.out.println("Funcionario: " + nome + ", Salario: R$ " + salario);
    }
    
}
