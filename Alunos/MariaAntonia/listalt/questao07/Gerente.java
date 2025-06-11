/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao07;

/**
 *
 * @author Maria Antônia
 */
public class Gerente extends Funcionario {
    double bonus;
    
    public Gerente(String nome, String cpf, double salarioBase, double bonus){
        super(nome,cpf,salarioBase); 
        this.bonus=bonus; 
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    
  
    @Override
    public double calcularSalario(){
        return salarioBase + bonus; 
    }
}
