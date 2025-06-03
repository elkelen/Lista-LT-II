/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Principal7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        System.out.println("-------------Cadastro de Funcionarios----------");
        System.out.println("Quantos funcionarios deseja cadastrar? ");
        int x = sc.nextInt();
        
        for(int i=0; i<x; i++){
            System.out.println("Digite -> 1 para Gerente e 2 para Vendendor:");
            int y = sc.nextInt();
            sc.nextLine();
            String nome;
            String cpf;
            double salarioBase;
            if(y==1){
                Gerente g;
                System.out.println("-----Gerente-----");
                System.out.println("Nome: ");
                nome = sc.nextLine();
                System.out.println("CPF: ");
                cpf = sc.nextLine();
                System.out.println("Salario Base: ");
                salarioBase = sc.nextDouble();
                System.out.println("Bonus: ");
                double bonus = sc.nextDouble();
                g = new Gerente(bonus, nome, cpf, salarioBase);
                
                funcionarios.add(g);
            }
            if(y==2){
                Vendedor v;
                System.out.println("-----Vendedor-----");
                System.out.println("Nome: ");
                nome = sc.nextLine();
                System.out.println("CPF: ");
                cpf = sc.nextLine();
                System.out.println("Salario Base: ");
                salarioBase = sc.nextDouble();
                System.out.println("Comissao: ");
                double comissao = sc.nextDouble();
                v = new Vendedor(comissao, nome, cpf, salarioBase);
                
                funcionarios.add(v);
            }
        }
        
        System.out.println(">>>>>>>>>>Funcionarios<<<<<<<<");
        for(Funcionario f : funcionarios){
            System.out.println(f);
            System.out.println("------------------------------");
        }
    }
}
