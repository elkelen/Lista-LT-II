package QUESTAO07E08;
public class Faxineiro extends Funcionario {
    
    double comissao;
    
    public Faxineiro(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
    
}
