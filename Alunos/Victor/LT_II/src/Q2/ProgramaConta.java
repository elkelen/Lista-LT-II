package Q2;

import java.util.Scanner;

public class ProgramaConta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria("12345", "Victor Hugo");

        System.out.println("=== DADOS INICIAIS DA CONTA ===");
        conta.mostrarDados();

       
        System.out.print("\nDigite o valor para depositar: R$");
        double valorDeposito = sc.nextDouble();
        conta.depositar(valorDeposito);
        System.out.println("Depósito realizado com sucesso.");

        
        System.out.println("\n=== DADOS APÓS DEPÓSITO ===");
        conta.mostrarDados();

        
        System.out.print("\nDigite o valor para sacar: R$");
        double valorSaque = sc.nextDouble();
        conta.sacar(valorSaque);

       
        System.out.println("\n=== DADOS APÓS SAQUE ===");
        conta.mostrarDados();

        sc.close();
    }
}