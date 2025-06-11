/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao10;

/**
 *
 * @author Maria Antônia
 */
public class Livro {
    String titulo; 
    String autor; 
    String isbn;
    boolean emprestado; 
    
    public Livro(String titulo, String autor, String isbn){
        this.titulo = titulo; 
        this.autor= autor; 
        this.isbn = isbn; 
        this.emprestado = false; 
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public void emprestar(){
        this.emprestado = true; 
    }
    
    public void devolver(){
        this.emprestado = false; 
    }
    
    
    @Override
    public String toString(){
        return "Titulo: "+titulo+"\nAutor: "+autor+"\nISBN: "+isbn+ "\n"+(emprestado ? "Emprestado": "Disponivel");
    }
}
