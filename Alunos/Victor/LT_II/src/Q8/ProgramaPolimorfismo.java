package Q8;

import java.util.ArrayList;

public class ProgramaPolimorfismo {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("João", "111.111.111-11", 2000));
        funcionarios.add(new Gerente("Maria", "222.222.222-22", 3000, 1000));
        funcionarios.add(new Vendedor("Pedro", "333.333.333-33", 1500, 500));
        funcionarios.add(new Vendedor("Ana", "444.444.444-44", 1600, 400));

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.nome);
            System.out.println("CPF: " + f.cpf);
            System.out.println("Salário calculado: R$ " + f.calcularSalario());
            System.out.println("----------------------");
        }
    }
}