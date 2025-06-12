package QUESTAO07E08;
import java.util.ArrayList;

public class DiversosFuncionarios{
    public static void main(String[] args) {
        ArrayList<Funcionario> equipe = new ArrayList<>();

        equipe.add(new Gerente("Mariana", "32165498700", 5200, 1800));
        equipe.add(new Faxineiro("Felipe", "78912345600", 3200, 1300));
        equipe.add(new Funcionario("Sofia", "45678912344", 2700));
        equipe.add(new Faxineiro("Samanta", "65498732188", 2900, 1100));
        equipe.add(new Gerente("Ricardo", "98765432166", 6100, 2200));

        for (Funcionario func : equipe) {
            System.out.println("Nome do funcionario: " + func.nome);
            System.out.println("Documento (CPF): " + func.cpf);
            System.out.printf("Remuneração total calculada: R$ %.2f%n", func.calcularSalario());
            System.out.println("=======================================");
        }
    }
}
