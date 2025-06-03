/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author evely
 */
public class Principal5 {
    public static void main(String[] args) {
        Set<Contato> contatos = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------Contatos---------");
        
        System.out.println("Quantos contatos deseja adicionar? ");
        int x = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<x; i++){
            Contato c;
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite o email: ");
            String email = sc.nextLine();
            System.out.println("Digite o telefone: ");
            String telefone = sc.nextLine();
            c = new Contato(nome, email, telefone);
            contatos.add(c);
            System.out.println("\n");
        }
        
        System.out.println("Lista de contatos no Hashet");
        for(Contato c : contatos){
            System.out.println(c);
        }
    }
}
