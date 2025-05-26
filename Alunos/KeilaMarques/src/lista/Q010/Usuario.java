package lista.Q010;

import java.util.ArrayList;
import java.util.List;

abstract class Usuario {

    private String nome;
    private String id;
    protected List<Livro> livrosEmprestados;

    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public abstract boolean podeEmprestar();

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
    }

    public void removerLivro(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "USUARIO: " + nome + " - ID: " + id + " - TIPO: "
                + (this instanceof UsuarioPremium ? "PREMIUM" : "COMUM");
    }
}
