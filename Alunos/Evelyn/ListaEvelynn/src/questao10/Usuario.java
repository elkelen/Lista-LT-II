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
public abstract class Usuario {
    private String nome;
    private String id;
    protected List<Livro> livros = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public abstract boolean podePegarEmprestado();
    
    public void pegarEmprestado(Livro l){
         livros.add(l);
    }
    
    public void devolverLivro(Livro l){
        livros.remove(l);
    }
     
}
