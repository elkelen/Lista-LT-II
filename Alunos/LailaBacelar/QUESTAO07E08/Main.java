package QUESTAO07E08;
public class Main{
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Joshua", "123.456.789-00", 5000, 2000);
        Funcionario funcionario = new Funcionario("Joseph", "111.222.333-44", 2500);

        System.out.println("=== Salário do Gerente ===");
        System.out.println("Nome: " + gerente.nome);
        System.out.printf("Salário base: R$ %.2f%n", gerente.salarioBase);
        System.out.printf("Bônus adicional: R$ %.2f%n", gerente.bonus);
        System.out.printf("Salário total: R$ %.2f%n", gerente.calcularSalario());
        System.out.println("-----------------------------");

        System.out.println("=== Salário do Funcionário ===");
        System.out.println("Nome: " + funcionario.nome);
        System.out.printf("Salário base: R$ %.2f%n", funcionario.salarioBase);
        System.out.printf("Salário total: R$ %.2f%n", funcionario.calcularSalario());
        System.out.println("-----------------------------");
    }
}
