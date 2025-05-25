package lista.wallace.Q02;

import java.util.Scanner;


public class Q2 {

   
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in); 

        ContaBancaria conta = new ContaBancaria(); 

        System.out.print("Digite o numero da conta: ");
        conta.numero = entrada.nextLine();

        System.out.print("Digite o nome do titular: ");
        conta.titular = entrada.nextLine();

        System.out.print("Digite o saldo inicial: ");
        conta.saldo = entrada.nextDouble();

        conta.mostrarDados(); 

        System.out.print("\nDigite o valor a depositar: ");
        double valorDeposito = entrada.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Digite o valor a sacar: ");
        double valorSaque = entrada.nextDouble();
        conta.sacar(valorSaque);

        conta.mostrarDados(); 

        entrada.close(); 
    }
    }
    

