package QUESTAO10;
import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;
    private ArrayList<Usuario> usuarios;

    public Biblioteca() {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro \"" + livro.getTitulo() + "\" adicionado ao acervo.");
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
        System.out.println("Usuário \"" + usuario.getNome() + "\" registrado com sucesso.");
    }

    public void emprestarLivro(String isbn, String usuarioId) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado no sistema.");
            return;
        }

        if (usuario == null) {
            System.out.println("Usuário com ID " + usuarioId + " não cadastrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("O livro \"" + livro.getTitulo() + "\" já está emprestado.");
            return;
        }

        if (!usuario.podeEmprestar()) {
            System.out.println("Usuário \"" + usuario.getNome() + "\" atingiu o limite de empréstimos.");
            return;
        }

        livro.setEmprestado(true);
        usuario.emprestarLivro(livro);
        System.out.println("Empréstimo realizado com sucesso: \"" + livro.getTitulo() + "\" foi emprestado para " + usuario.getNome() + ".");
    }

    public void devolverLivro(String isbn) {
        Livro livro = buscarLivro(isbn);

        if (livro == null) {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
            return;
        }

        if (!livro.isEmprestado()) {
            System.out.println("O livro \"" + livro.getTitulo() + "\" não está emprestado atualmente.");
            return;
        }

        for (Usuario usuario : usuarios) {
            if (usuario.getLivrosEmprestados().contains(livro)) {
                usuario.devolverLivro(livro);
                livro.setEmprestado(false);
                System.out.println("Livro \"" + livro.getTitulo() + "\" devolvido com sucesso por " + usuario.getNome() + ".");
                return;
            }
        }

        System.out.println("Não foi possível identificar o usuário que emprestou o livro.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Lista de Livros Disponíveis:");
        boolean encontrou = false;
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                System.out.println("Título: " + livro.getTitulo() + " | Autor: " + livro.getAutor() + " | ISBN: " + livro.getIsbn());
                encontrou = true;
            }
        }
        if (!encontrou) {
            System.out.println("Nenhum livro disponível no momento.");
        }
        System.out.println("----------------------------------");
    }

    private Livro buscarLivro(String isbn) {
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null;
    }

    private Usuario buscarUsuario(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null;
    }
}

