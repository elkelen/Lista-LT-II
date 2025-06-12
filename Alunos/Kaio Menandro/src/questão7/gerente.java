package LISTA.questão7;


    public class gerente extends funcionario {
    
    double bonus;
    
    public gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
    

