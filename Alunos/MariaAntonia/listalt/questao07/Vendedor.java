/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao07;

/**
 *
 * @author Maria Antônia
 */
public class Vendedor extends Funcionario {
    double comissao; 
    
    public Vendedor(String nome, String cpf, double salarioBase,double comissao){
        super(nome,cpf,salarioBase); 
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
        return salarioBase+ comissao; 
    }
    
}
