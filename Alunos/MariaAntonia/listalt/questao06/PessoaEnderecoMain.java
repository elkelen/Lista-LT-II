/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao06;

import listalt.questao06.Pessoa;
import listalt.questao06.Endereco;
import java.util.Scanner;

/**
 *
 * @author Maria Antônia
 */
public class PessoaEnderecoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println(" --- PESSOA ---");
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine(); 
        System.out.println("Digite sua idade: ");
        int idade  = scanner.nextInt(); 
        scanner.nextLine();
        
        System.out.println(" --- ENDERECO --- ");
        System.out.println("Digite sua rua: ");
        String rua = scanner.nextLine(); 
        System.out.println("Digite o n de sua casa: ");
        int numero = scanner.nextInt(); 
        scanner.nextLine();
        System.out.println("Digite sua Cidade: ");
        String cidade = scanner.nextLine(); 
        System.out.println("Digite o CEP: ");
        String cep = scanner.nextLine(); 
        
        // criando objetos 
        Endereco endereco = new Endereco(rua,numero,cidade,cep);
        Pessoa pessoa = new Pessoa(nome,idade,endereco); 
        
        System.out.println("\n--- CADASTRO CONCLUIDO ---");
        System.out.println(pessoa);
        
        
    }
    
}
