package lista.wallace.Q07;

import lista.wallace.Q07.Funcionario;

public class Gerente extends Funcionario{
    double bonus;
    
    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario(){
        return salarioBase + bonus;
    }
    
    
}
