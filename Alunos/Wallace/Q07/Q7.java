package lista.wallace.Q07;

import java.util.ArrayList;

public class Q7 {

    public static void main(String[] args) {
       ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario("Keila", "111.111.111-11", 2000));
        lista.add(new Gerente("Wallace", "222.222.222-22", 3000, 1000));
        lista.add(new Vendedor("Lucas", "333.333.333-33", 2500, 800));

        for (Funcionario f : lista) {
            System.out.println("Nome: " + f.getNome());
            System.out.println("Salario calculado: R$ " + f.calcularSalario());
            System.out.println("--------------------------------");
        }
    }
    
}
