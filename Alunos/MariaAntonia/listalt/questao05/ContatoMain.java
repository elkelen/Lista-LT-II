/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao05;

import listalt.questao05.Contato;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Maria Antônia
 */
public class ContatoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        HashSet<Contato> contatos = new HashSet<>(); 
        
        System.out.println(" --- VAMOS CADASTRAR CONTATOS :) --- ");
        System.out.println("Quantos contatos deseja cadastrar? ");
        int quantidade = scanner.nextInt(); 
        scanner.nextLine(); 
        
        
        for(int i = 0 ; i < quantidade; i ++ ){
            System.out.println("Cadastrando Contato "+(i+ 1)+": "); 
            System.out.println("Digite seu Nome: ");
            String nome = scanner.nextLine(); 
            System.out.println("Digite seu email: ");
            String email = scanner.nextLine(); 
            System.out.println("Digite seu Telefone: ");
            String telefone = scanner.nextLine(); 
            
            Contato contato = new Contato (nome,email,telefone); 
            
            if(contatos.add(contato)){
                System.out.println("CONTATO ADCIONADO!");
                System.out.println(" ");
            }else {
                System.out.println("UM CONTATO COM ESSE EMAIL JA EXISTE!");
                System.out.println(" ");
            }
            
            
        }
        
        System.out.println("Contatos cadastrados: ");
        for(Contato c : contatos){
            System.out.println(c);
        }
    }
    
}
