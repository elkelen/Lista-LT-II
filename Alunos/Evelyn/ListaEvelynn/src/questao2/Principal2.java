/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

import java.util.Scanner;

/**
 *
 * @author curso
 */
public class Principal2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ContaBancaria cb;
        int numero;
        String titular;
        double saldo;
        double valor;
        System.out.println("--------------- CONTA BANCARIA -----------------");
        
        System.out.println("Digite o numero da conta: ");
        numero = sc.nextInt();
        System.out.println("Digite o nome do titular: ");
        titular = sc.nextLine();
        System.out.println("Digite o saldo da conta: ");
        saldo = sc.nextDouble();
        
        cb = new ContaBancaria(numero, titular, saldo);
        cb.mostrarDados();
        
        System.out.println("-------------------------------\n");
        System.out.println("Quanto voce deseja depositar? ");
        valor = sc.nextDouble();
        cb.depositar(valor);
        
        System.out.println("Saldo atualizado: " + cb.getSaldo());
        
        System.out.println("-------------------------------\n");
        System.out.println("Quanto voce deseja sacar? ");
        valor = sc.nextDouble();
        
        cb.sacar(valor);
        System.out.println("Saldo atualizado: " + cb.getSaldo());
    }
}
