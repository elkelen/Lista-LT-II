
package LISTA.questão7;
import java.util.ArrayList;

public class questão8 {
    
    public static void main(String[] args) {
        // Criando a lista de funcionários (polimórfica)
        ArrayList<funcionario> funcionarios = new ArrayList<>();

        // Adicionando funcionários de tipos diferentes
        funcionarios.add(new gerente("kaio", "123.456.789-00", 15000, 3000));
        funcionarios.add(new vendedor("menandro", "678.224.321-11", 3000, 1500));
        funcionarios.add(new funcionario("kaiomenandro", "345.242.454-44", 2500));
        funcionarios.add(new vendedor("menandrinho", "1111111111", 4500, 1200));
        funcionarios.add(new gerente("kaioba", "222222222", 9000, 3400));

        // Iterando sobre a lista de forma polimórfica
        for (funcionario f : funcionarios) {
            System.out.println("Funcionário: " + f.nome);
            System.out.println("CPF: " + f.cpf);
            System.out.println("Salário calculado: R$ " + f.calcularSalario());
            System.out.println("\n\n");
        }
    }
    
}
