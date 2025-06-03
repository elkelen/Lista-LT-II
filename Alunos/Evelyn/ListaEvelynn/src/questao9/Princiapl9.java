/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao9;

import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Princiapl9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Dgite o valor do produto: ");
        double valor = sc.nextDouble();
        
        sc.nextLine();
        Produto p = new Produto(nome, valor);
        
        System.out.println("-----------------------\n");
        
        System.out.println("Digite o nome do funcionario: ");
        nome = sc.nextLine();
        System.out.println("Digite o cargo do funcionario: ");
        String cargo = sc.nextLine();
        
        Funcionario f = new Funcionario(nome, cargo);
        System.out.println("--------------------------\n");
        
        System.out.println("Digite o titulo do relatorio: ");
        String titulo = sc.nextLine();
        Relatorio r = new Relatorio(titulo);
        
        System.out.println("--------------------------\n");
        
        System.out.println("Digite o titulo da carta: ");
        titulo = sc.nextLine();
        Carta c = new Carta(titulo);
        
        System.out.println("--------------------------\n");
        p.imprimir();
        System.out.println("--------------------------\n");
        f.imprimir();
        System.out.println("--------------------------\n");
        r.abrir();
        System.out.println("--------------------------\n");
        c.abrir();
    }
}
