package quest007;

import java.util.ArrayList;

public class mainw {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionarios para cumprir a questão 8
        funcionarios.add(new Gerente("Wild", "111.111.111-11", 5000.0, 2000.0));
        funcionarios.add(new Vendedor("Renan", "222.222.222-22", 3000.0, 1200.0));
        funcionarios.add(new Vendedor("Lucas", "333.333.333-33", 2500.0, 900.0));
        funcionarios.add(new Gerente("Luciano", "444.444.444-44", 5500.0, 1800.0));

        // já pego o nome da class para saber quem é quem. kkkkkkkk
        for (Funcionario f : funcionarios) {
            System.out.println(f.getClass().getSimpleName() + ": " + f.nome +
                " | Salário calculado: R$ " + f.calcularSalario()); 
        }
    }
}


