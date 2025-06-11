package QUESTAO10;
import java.util.ArrayList;

public class Usuario {
    protected String nome;
    protected String id;
    protected ArrayList<Livro> livrosEmprestados;


    public Usuario(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

  
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public boolean podeEmprestar() {
        return true;
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        System.out.println(nome + " realizou o empréstimo do livro: " + livro.getTitulo());
    }

    public void devolverLivro(Livro livro) {
        if (livrosEmprestados.remove(livro)) {
            System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
        } else {
            System.out.println("O livro '" + livro.getTitulo() + "' não está na lista de empréstimos de " + nome);
        }
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros atualmente emprestados por " + nome + ":");
        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } else {
            for (Livro livro : livrosEmprestados) {
                System.out.println("- " + livro.getTitulo());
            }
        }
    }
}
