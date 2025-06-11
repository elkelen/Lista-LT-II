/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao10;

import listalt.questao10.Usuario;
import listalt.questao10.Livro;
import java.util.ArrayList;

/**
 *
 * @author Maria Antônia
 */
public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>(); // private para poder ser acessada apenas por essa classe
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void emprestarLivro(String isbn, int uId){
        Livro livro = buscandoLivro(isbn);
        Usuario usuario = buscarUsuario(uId); 
        
        if (livro == null){
        System.out.println("Livro inexistente");
        return;
        }
        if (usuario == null){
        System.out.println("Usuário inexistente");
        return; 
        }
        if(livro.isEmprestado()){
        System.out.println("Livro indisponivel, ja esta emprestado!"); 
        return; 
        }
        if (usuario.podeEmprestar()){
        livro.emprestar(); 
        usuario.adicionarLivro(livro); 
        System.out.println("Livro emprestado para: "+usuario.getNome());
        } else {
        System.out.println("O(a)"+ usuario.getNome()+" ja atingiu o limite de emprestimos de livros ):");
        }
        
    }
    
   
    public void devolverLivro(String isbn){
        Livro livro = buscandoLivro(isbn); 
        if(livro == null){
            System.out.println("Livro nao encontrado!");
            return;
        }
        
        if(!livro.isEmprestado()){
            System.out.println("Livro disponivel!");
            return;  
        }
        
        for(Usuario usuario : usuarios){
            if(usuario.getLivrosEmprestados().contains(livro)){
                usuario.removerLivro(livro); 
                livro.devolver();
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Livro nao encontra-se como emprestado a nenhum usuario");
    }
    
    public void listarLivrosDisponiveis(){
        System.out.println("--- Livros Disponiveis ---");
        for(Livro livro : livros){
            if(!livro.isEmprestado()){
                System.out.println(livro);
            }
        }
    }
    
    private Livro buscandoLivro(String isbn){
        for(Livro livro: livros){
            if(livro.getIsbn().equals(isbn)){
               return livro; 
            }
        }
        return null; 
    }
    
    private Usuario buscarUsuario(int id){
        for(Usuario usuario : usuarios){
            if(usuario.getId() == id){
                return usuario; 
            }
        }
         return null; 
    }
   
}
