/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao04;

import listalt.questao04.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Maria Antônia
 */
public class CalculadoraMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Calculadora calculadora = new Calculadora(); // objeto da classe onde estão os métodos somar
        
        System.out.println("--- SOMA DE INTEIROS ---"); 
        System.out.println("Digite o valor do primeiro inteiro: ");
        int a = scanner.nextInt(); 
        System.out.println("Digite o valor do segundo inteiro: ");
        int b = scanner.nextInt(); 
        int resultado1= calculadora.somar(a, b); // chamando o método da classe e exibindo na variavel 
        System.out.println(" A soma dos dois valores digitados e: "+resultado1);
        
        
        System.out.println("--- SOMA DE DECIMAIS ---");
        System.out.println("Digite o valor do primeiro decimal(colocar virgula): ");
        double c = scanner.nextDouble(); 
        System.out.println("Digite o valor do segundo decimal: ");
        double d = scanner.nextDouble(); 
        double resultado2= calculadora.somar(c, d);
        System.out.println("A soma dos dois valores digitados e: "+resultado2);
        
        System.out.println("--- SOMANDO VARIOS INTEIROS ---");
        System.out.println("Quantos inteiros deseja somar? "); 
        int quantidade = scanner.nextInt(); 
        int[] valores = new int [quantidade];  // criando um array com o tamanho definido pelo usuário
        for (int i = 0; i < quantidade; i ++){
            System.out.println("Digite o valor "+(i+1)+":");
            valores[i]= scanner.nextInt(); 
        }
        int resultado3= calculadora.somar(valores); 
        System.out.println("A soma dos " +quantidade+ " valores digitados e: "+resultado3);
        
        scanner.close();
    }
    
}
