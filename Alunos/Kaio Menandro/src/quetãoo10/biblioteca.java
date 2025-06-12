package LISTA.quetãoo10;
import java.util.ArrayList;

public class biblioteca {
  
    private ArrayList<livro> livros;
    private ArrayList<usuario> usuarios;

    public biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarLivro(livro livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(usuario usuario) {
        usuarios.add(usuario);
    }

    public void emprestarLivro(String isbn, String usuarioId) {
        livro livro = buscarLivro(isbn);
        usuario usuario = buscarUsuario(usuarioId);

        if (livro == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário com ID " + usuarioId + " não encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("Livro já está emprestado.");
            return;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Usuário atingiu o limite de empréstimos.");
            return;
        }

        livro.setEmprestado(true);
        usuario.emprestarLivro(livro);
        System.out.println("\nLivro emprestado com sucesso para " + usuario.getNome() + ".");
    }

    public void devolverLivro(String isbn) {
        livro livro = buscarLivro(isbn);
        if (livro == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
            return;
        }

        if (!livro.isEmprestado()) {
            System.out.println("\nLivro não está emprestado.");
            return;
        }

        for (usuario usuario : usuarios) {
            if (usuario.getLivrosEmprestados().contains(livro)) {
                usuario.devolverLivro(livro);
                livro.setEmprestado(false);
                System.out.println("\nLivro devolvido com sucesso por " + usuario.getNome() + ".");
                return;
            }
        }

        System.out.println("\nUsuário que emprestou o livro não encontrado.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("    Livros Disponíveis    \n ");
        for (livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println(livro.getTitulo() + " - Autor: " + livro.getAutor() + " - ISBN: " + livro.getIsbn());
            }
        }
        System.out.println("\n\n");
    }

    private livro buscarLivro(String isbn) {
        for (livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private usuario buscarUsuario(String id) {
        for (usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }
}