
package lista.Q007;

import java.util.ArrayList;
import java.util.List;

public class MainFGV {

    public static void main(String[] args) {
        
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("WALLACE", "111111111", 2000));
        funcionarios.add(new Gerente("KEILA", "222222222", 3000, 1000));
        funcionarios.add(new Vendedor("LUCAS", "333333333", 1500, 500));

        for (Funcionario f : funcionarios) {
            System.out.println("NOME: " + f.nome + " - SALARIO: " + f.calcularSalario());
        }
    }
    
}
