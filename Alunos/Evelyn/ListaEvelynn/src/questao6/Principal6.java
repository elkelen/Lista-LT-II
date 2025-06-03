/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author evely
 */
public class Principal6 {
    public static void main(String[] args) {
        System.out.println("----------Cadastro de Pessoa----------");
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        System.out.println("Quantas pessoas deseja cadastrar? ");
        int x = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<x; i++){
            Pessoa pessoa;
            System.out.println("-----Pessoa " + i + "----------");
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Edereco: ");
            Endereco endereco;
            
            System.out.println("Rua: ");
            String rua = sc.nextLine();
            
            System.out.println("Numero: ");
            int numero = sc.nextInt();
            
            sc.nextLine();
            
            System.out.println("Cidade: ");
            String cidade = sc.nextLine();
            
            System.out.println("CEP: ");
            String cep = sc.nextLine();
            
            endereco = new Endereco(rua, numero, cidade, cep);
            pessoa = new Pessoa(nome, idade, endereco);
            
            pessoas.add(pessoa);
            System.out.println("\n");
        }
        
        for(Pessoa p : pessoas){
            System.out.println(p);
        }
    }
}
