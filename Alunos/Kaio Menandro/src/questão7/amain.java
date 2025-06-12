package LISTA.questão7;

public class amain {
   
    
    public static void main(String[] args) {
        // Criando objetos
        gerente gerente = new gerente("kaio", "123.456.789-00", 15000, 3000);
        vendedor vendedor = new vendedor("menandro", "987.654.321-00", 3000, 1500);
        funcionario funcionario = new funcionario("kaiomenandro", "111.222.333-44", 2500);

        // Exibindo os salários calculados
        System.out.println("Funcionário: " + gerente.nome);
        System.out.println("Salário: R$ " + gerente.calcularSalario());
        

        System.out.println("\n\nFuncionário: " + vendedor.nome);
        System.out.println("Salário: R$ " + vendedor.calcularSalario());
       

        System.out.println("\n\nFuncionário: " + funcionario.nome);
        System.out.println("Salário: R$ " + funcionario.calcularSalario());
        
    }
}
    

