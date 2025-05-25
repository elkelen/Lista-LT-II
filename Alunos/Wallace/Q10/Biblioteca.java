package lista.wallace.Q10;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    List<Livro> livros = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<>();

    public void addLivro(Livro livro) {
        livros.add(livro);
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean emprestarLivro(String isbn, String usuarioId) {
        Livro livro = buscarLivro(isbn);
        Usuario usuario = buscarUsuario(usuarioId);

        if (livro != null && usuario != null && !livro.isEmprestado() && usuario.podeEmprestar()) {
            livro.setEmprestado(true);
            if (usuario instanceof UsuarioComum) {
                ((UsuarioComum) usuario).addLivro();
            }
            return true;
        }
        return false;
    }

    public boolean devolverLivro(String isbn) {
        Livro livro = buscarLivro(isbn);
        if (livro != null && livro.isEmprestado()) {
            livro.setEmprestado(false);
            return true;
        }
        return false;
    }
    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros) {
            if (!livro.isEmprestado()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
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
