/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao10;

import java.util.Scanner;

/**
 *
 * @author curso
 */
public class Principal10 {
    public static void main(String[] args) {
         Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("--------------------BIBLIOTECA------------------\n");
        
        System.out.println("Quantos livros deseja cadastrar? ");
        int x = sc.nextInt();
        
        sc.nextLine();
        
        System.out.println("-------Livros------\n");
        
        for(int i=0; i<x; i++){
            System.out.print("Titulo: ");
            String titulo = sc.nextLine();
            System.out.print("Autor: ");
            String autor = sc.nextLine();
            System.out.print("ISBN: ");
            String isbn = sc.nextLine();
            
            Livro livro = new Livro(titulo, autor, isbn, false);
            
            biblioteca.adicionarLivro(livro);
        }
        
        System.out.println("Quantos usuarios deseja cadastrar? ");
        int y = sc.nextInt();
        
        sc.nextLine();
        for(int i=0; i<y;i++){
            System.out.println("Digite 1 para usuaro comum, e 2 para usuario premium: ");
            int z = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("ID: ");
            String id = sc.nextLine();
            if(z == 1){
                UsuarioPremium up = new UsuarioPremium(nome, id);
                biblioteca.adicionarUsuario(up);
            }
            if(z==2){
                UsuarioComum uc = new UsuarioComum(nome, id);
                biblioteca.adicionarUsuario(uc);
            }
            
        }
        
        biblioteca.listasLivrosDisponiveis();
        
        System.out.println("\n----------------------------------------------------");
        
        System.out.print("Quantos livros deseja pegar emprestado? ");
        int sn = sc.nextInt();
        
        sc.nextLine();
        for(int i=0; i<sn; i++){
            
            System.out.print("Digte o id do usuario: ");
            String id = sc.nextLine();
            System.out.print("Digite o isbn do livro: ");
            String isbn = sc.nextLine();
            biblioteca.emprestarLivro(isbn, id);
           
        }
        
        biblioteca.listasLivrosDisponiveis();
        
        System.out.println("\n----------------------------------------------------");
        
        System.out.print("Quantos livros deseja devolver? ");
        sn = sc.nextInt();
        
        sc.nextLine();
        for(int i=0; i<sn; i++){
            System.out.print("Digite o isbn do livro: ");
            String isbn = sc.nextLine();
            biblioteca.devolverLivro(isbn);
            
        }
        
        biblioteca.listasLivrosDisponiveis();
        
        
    }
}
