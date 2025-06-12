package LISTA.questão7;

public class vendedor extends funcionario {
    
    double comissao;
    
    public vendedor(String nome, String cpf, double salarioBase, double comissao) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissao;
    }
    
}
