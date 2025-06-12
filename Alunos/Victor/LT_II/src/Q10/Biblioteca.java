package Q10;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Livro> acervo;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.acervo = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

   
    public void adicionarLivro(Livro livro) {
        this.acervo.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    
    private Livro buscarLivroPorIsbn(String isbn) {
        for (Livro livro : acervo) {
            if (livro.getIsbn().equals(isbn)) {
                return livro;
            }
        }
        return null; 
    }

    private Usuario buscarUsuarioPorId(String id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId().equals(id)) {
                return usuario;
            }
        }
        return null; 
    }

    
    public void emprestarLivro(String isbn, String usuarioId) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(usuarioId);

        if (livro == null) {
            System.out.println("ERRO: Livro com ISBN " + isbn + " não encontrado.");
            return;
        }
        if (usuario == null) {
            System.out.println("ERRO: Usuário com ID " + usuarioId + " não encontrado.");
            return;
        }

        if (livro.isEmprestado()) {
            System.out.println("ERRO: O livro '" + livro + "' já está emprestado.");
        } else if (!usuario.podeEmprestar()) {
            System.out.println("ERRO: Usuário " + usuario.getNome() + " (ID: " + usuarioId + ") atingiu o limite de empréstimos.");
        } else {
            livro.emprestar();
            usuario.adicionarLivro(livro);
            System.out.println("Empréstimo realizado com sucesso para " + usuario.getNome() + ": " + livro.toString().substring(8));
        }
    }

    public void devolverLivro(String isbn) {
        Livro livro = buscarLivroPorIsbn(isbn);
        if (livro == null) {
            System.out.println("ERRO: Livro com ISBN " + isbn + " não encontrado.");
            return;
        }

        if (!livro.isEmprestado()) {
            System.out.println("ERRO: O livro '" + livro.toString().substring(8) + "' já estava disponível.");
            return;
        }
        
        
        for (Usuario u : usuarios) {
            for (Livro l : u.livrosEmprestados) {
                if (l.getIsbn().equals(isbn)) {
                    u.removerLivro(l);
                    break;
                }
            }
        }

        livro.devolver();
        System.out.println("Livro '" + livro.toString().substring(8) + "' devolvido com sucesso.");
    }
    
    public void listarLivrosDisponiveis() {
        System.out.println("Livros Disponíveis:");
        boolean algumDisponivel = false;
        for (Livro livro : acervo) {
            if (!livro.isEmprestado()) {
                System.out.println("- " + livro);
                algumDisponivel = true;
            }
        }
        if (!algumDisponivel) {
            System.out.println("Nenhum livro disponível no momento.");
        }
    }
}