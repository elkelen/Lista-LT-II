/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao10;

import listalt.questao10.Livro;
import java.util.ArrayList;

/**
 *
 * @author Maria Antônia
 */
public abstract class Usuario {
    protected String nome; 
    protected int id; 
    protected ArrayList<Livro>livrosEmprestados; // lista que vai guardar os livros que o usuário pegou emprestado
    
    // construtor 
    public Usuario(String nome, int id){
        this.nome = nome; 
        this.id = id; 
        this.livrosEmprestados = new ArrayList(); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(ArrayList<Livro> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }
    
    public abstract boolean podeEmprestar(); 
    
    //métodos para adcionar livros a lista de livrosEmprestados
    public void adicionarLivro(Livro livro){
        livrosEmprestados.add(livro); 
    }
    
    // remover livro da lista 
    public void removerLivro(Livro livro){
        livrosEmprestados.add(livro); 
    }
}

