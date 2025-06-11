package QUESTAO07E08;
public class Gerente extends Funcionario {
    
    double bonus;
    
    public Gerente(String nome, String cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
    
    public void exibirSalario() {
        System.out.println("Gerente: " + nome);
        System.out.printf("Salário base: R$ %.2f%n", salarioBase);
        System.out.printf("Bônus: R$ %.2f%n", bonus);
        System.out.printf("Salário total com bônus: R$ %.2f%n", calcularSalario());
    }
}
