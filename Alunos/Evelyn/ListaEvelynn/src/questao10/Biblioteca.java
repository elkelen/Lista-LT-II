/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao10;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author curso
 */
public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    
    public Usuario encontrarUsuario(String id){
        for(Usuario u : usuarios){
            if(u.getId().equals(id)){
                return u;
            }
        }
        return null;
    }
    
    public Livro encontrarLivro(String isbn){
        for (Livro l : livros){
            if(l.getIsbn().equals(isbn)){
                return l;
            }
        }
        return null;
    }
    
    public void emprestarLivro(String isbn, String id){
        Usuario u = encontrarUsuario(id);
        Livro l = encontrarLivro(isbn);
        
        if(u == null || l == null){
            System.out.println("Usuario ou livro nao encontrados!!");
            return;
        }
        if (l.isEmprestado()){
            System.out.println("Esse livro já foi emprestado!");
            return;
        }
        if(!u.podePegarEmprestado()){
            System.out.println("Usuario ja atingiu o limite de emprestimos!!");
            return;
        }
        
        l.setEmprestado(true);
        u.pegarEmprestado(l);
        System.out.println("O livro: "+ l.getTitulo() +" foi emprestado a " + u.getNome());
        
        
    }
    
    public void devolverLivro(String isbn){
        Livro l = encontrarLivro(isbn);
        
        if(l==null || !l.isEmprestado()) {
            System.out.println("O livro não foi encontrado ou nao foi emprestado!");
            return;
        }
        for (Usuario u : usuarios){
            if(u.livros.contains(l)){
                u.devolverLivro(l);
                l.setEmprestado(false);
                System.out.println("Livro devolvido por " + u.getNome());
                return;
            }
        }
        
        System.out.println("Livro encontrado!!!");
    }
    
    public void listasLivrosDisponiveis(){
        System.out.println("-----------Livros Disponiveis----------------");
        for(Livro l : livros){
            if(!l.isEmprestado()){
                System.out.println(l);
            }
        }
    }
}
