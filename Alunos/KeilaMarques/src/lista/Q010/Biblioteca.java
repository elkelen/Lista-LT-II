package lista.Q010;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Biblioteca {

    private Map<String, Livro> livros;
    private Map<String, Usuario> usuarios;

    public Biblioteca() {
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.put(livro.getIsbn(), livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.put(usuario.getId(), usuario);
    }

    public boolean emprestarLivro(String isbn, String usuarioId) {
        Livro livro = livros.get(isbn);
        Usuario usuario = usuarios.get(usuarioId);

        if (livro == null || usuario == null || livro.isEmprestado() || !usuario.podeEmprestar()) {
            return false;
        }

        livro.setEmprestado(true);
        usuario.adicionarLivro(livro);
        return true;
    }

    public boolean devolverLivro(String isbn) {
        Livro livro = livros.get(isbn);
        if (livro == null || !livro.isEmprestado()) {
            return false;
        }

        livro.setEmprestado(false);
        for (Usuario usuario : usuarios.values()) {
            if (usuario.livrosEmprestados.contains(livro)) {
                usuario.removerLivro(livro);
                break;
            }
        }
        return true;
    }

    public List<Livro> listarLivrosDisponiveis() {
        List<Livro> disponiveis = new ArrayList<>();
        for (Livro livro : livros.values()) {
            if (!livro.isEmprestado()) {
                disponiveis.add(livro);
            }
        }
        return disponiveis;
    }

    public void relatorioStatus() {
        System.out.println("\nRELATORIO DA BIBLIOTECA:");
        System.out.println("TOTAL DE LIVROS: " + livros.size());
        System.out.println("LIVROS EMPRESTADOS: " + (livros.size() - listarLivrosDisponiveis().size()));
        System.out.println("USUARIOS CADASTRADOS: " + usuarios.size());
    }
}
