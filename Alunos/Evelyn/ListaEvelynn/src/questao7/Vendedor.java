/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

/**
 *
 * @author evely
 */
public class Vendedor extends Funcionario{
    private double comissao;
    
    public Vendedor(){
        
    }

    public Vendedor(double comissao) {
        this.comissao = comissao;
    }

    public Vendedor(double comissao, String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    @Override
    public double calcularSalario(){
        return getComissao() + getSalarioBase();
    }
}
