
package lista.Q008;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
   
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("WALLACE", "444444444", 2500));
        funcionarios.add(new Gerente("KEILA", "555555555", 4000, 1500));
        funcionarios.add(new Vendedor("LUCAS", "666666666", 1800, 700));

        System.out.println("SALARIOS CALCULADOS:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.nome + " : " + f.calcularSalario());
        }
    }

}
