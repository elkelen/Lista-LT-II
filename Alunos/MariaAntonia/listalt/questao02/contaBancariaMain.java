/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao02;

import listalt.questao02.ContaBancaria;
import java.util.Scanner;

/**
 *
 * @author Maria Antônia
 */
public class contaBancariaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("------ Bem - Vindo ------");
        System.out.println("Digite o numero da conta: ");
        String numero = scanner.nextLine(); 
        System.out.println("Digite o seu nome: ");
        String titular = scanner.nextLine(); 
        System.out.println("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble(); 
        
        ContaBancaria conta = new ContaBancaria(numero, titular, saldo); 
        
        System.out.println(" DADOS INICIAIS ");
        conta.mostrarDados();
        System.out.println(" ");
        
        
        while(true){
           System.out.println(" Escolha 1 - DEPOSITO, 2-SAQUE, 3-CONSULTAR CONTA e 0- FINALIZAR.");
            int escolha = scanner.nextInt(); 
      
            if(escolha == 1){
                System.out.println("Digite o valor para DEPOSITO: "); 
                double valorD = scanner.nextDouble(); 
                conta.depositar(valorD);
                System.out.println("Saldo APOS depósito: "+conta.getSaldo());
            }
            else if(escolha == 2){
                System.out.println("Digite o valor para SAQUE: ");
                double valorS = scanner.nextDouble(); 
                conta.sacar(valorS); 
                System.out.println("Saldo APOS Saque: "+conta.getSaldo());
            }else if(escolha == 3){
              conta.mostrarDados();  
            }else if(escolha == 0){
                System.out.println("Operacao realizada! Obrigado(o). Que Deus abencoe o restante de seu dia");
                break; 
            }else{
                System.out.println(" Operação NAO identificada!");
            }
       
    }
        scanner.close();
    }
}
