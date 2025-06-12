package QUESTAO02;
import java.util.Scanner;

public class Main_ContaBancaria {
    public static void main(String[] args) {

        try (Scanner teste = new Scanner(System.in)) {
            ContaBancaria conta = new ContaBancaria(654321, "Joana Maria", 2123.0);

            System.out.println("=== Dados Iniciais da Conta ===\n");
            conta.mostrarDados();

            System.out.print("\nInforme o valor a ser depositado: R$ ");
            double valorDeposito = teste.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("\n=== Dados Atualizados Após Depósito ===\n");
            conta.mostrarDados();

            System.out.print("\nInforme o valor a ser sacado: R$ ");
            double valorSaque = teste.nextDouble();
            conta.sacar(valorSaque);
            System.out.println("\n=== Dados Atualizados Após Saque ===\n");
            conta.mostrarDados();
        }
    }
}
   
