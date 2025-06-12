package Q10;

import java.util.ArrayList;
import java.util.List;

public abstract class Usuario {
    protected String nome;
    protected String id;
    protected List<Livro> livrosEmprestados;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    
    public String getNome() {
        return nome;
    }

    public String getId() {
        return id;
    }
    
    
    public void adicionarLivro(Livro livro) {
        this.livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        this.livrosEmprestados.remove(livro);
    }
    
    
    public abstract boolean podeEmprestar();

    @Override
    public String toString() {
        return "Usuário: " + nome + " (ID: " + id + ")";
    }
}