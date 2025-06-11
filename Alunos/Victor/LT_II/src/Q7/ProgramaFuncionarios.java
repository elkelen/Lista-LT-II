package Q7;

import java.util.ArrayList;

public class ProgramaFuncionarios {
    public static void main(String[] args) {
        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(new Funcionario("João", "111.111.111-11", 2000));
        lista.add(new Gerente("Maria", "222.222.222-22", 3000, 1000));
        lista.add(new Vendedor("Pedro", "333.333.333-33", 1500, 500));

        for (Funcionario f : lista) {
            System.out.println(f.toString());
        }
    }
}
