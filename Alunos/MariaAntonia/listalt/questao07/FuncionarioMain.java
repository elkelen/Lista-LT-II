/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao07;
import java.util.ArrayList;

/**
 *
 * @author Maria Antônia
 */
public class FuncionarioMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Funcionario> f = new ArrayList<>(); 
        
        f.add(new Funcionario ("Elk Elen", "087.789.505-88",3600));
        f.add(new Gerente("Qutle Lima", "107.080.175-49",3600,1000)); 
        f.add(new Vendedor("Wallace","869.186.445-14",3600,150));
        
        System.out.println("--- LISTA DE FUNCIONARIOS ---");
        for(Funcionario x : f){
            System.out.println(x);
            System.out.println("Salario total + (bonus/comissao): "+x.calcularSalario());
            System.out.println("________________________________");
        }
    }
    
}
