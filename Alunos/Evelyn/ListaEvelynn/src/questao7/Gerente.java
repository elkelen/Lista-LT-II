/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

/**
 *
 * @author evely
 */
public class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(){
        
    }

    public Gerente(double bonus) {
        this.bonus = bonus;
    }

    public Gerente(double bonus, String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public double calcularSalario(){
        return getBonus() + getSalarioBase();
    }
}
