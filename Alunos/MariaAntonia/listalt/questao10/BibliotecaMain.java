/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao10;

import listalt.questao10.UsuarioComum;
import listalt.questao10.Biblioteca;
import listalt.questao10.Usuario;
import listalt.questao10.Livro;

/**
 *
 * @author Maria Antônia
 */
public class BibliotecaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca (); 
        
        // inventando livros 
        biblioteca.adicionarLivro(new Livro("E assim que acaba", "Collen Hoover","23")); 
        biblioteca.adicionarLivro(new Livro("A saga do gato preto", "Luiz Roberto Guedes","12")); 
        biblioteca.adicionarLivro(new Livro("Amor de Redencao", "Francine Rivers","456")); 
        biblioteca.adicionarLivro(new Livro("As cronicas de Narnia", "C.S Lewis","085")); 
        
        // usuarios 
        Usuario u1 = new UsuarioComum("Maria Antonia", 22); 
        Usuario u2 = new UsuarioComum("Victor Nunes", 10); 
        Usuario u3 = new UsuarioComum("Maria Helena", 18); 
        
        biblioteca.adicionarUsuario(u1);
        biblioteca.adicionarUsuario(u2);
        biblioteca.adicionarUsuario(u3);
        
        // emprestimo 
        biblioteca.emprestarLivro("23",22); 
        biblioteca.emprestarLivro("456",22); 
        biblioteca.emprestarLivro("085",22);
        biblioteca.emprestarLivro("12",22);
        biblioteca.emprestarLivro("23",10); 
        biblioteca.emprestarLivro("456",10); 
        biblioteca.emprestarLivro("085",18); 
        
        biblioteca.listarLivrosDisponiveis();
        
        biblioteca.devolverLivro("085"); 
        
        biblioteca.devolverLivro("23");
        
        biblioteca.listarLivrosDisponiveis();
        
        
        
    }
    
}
