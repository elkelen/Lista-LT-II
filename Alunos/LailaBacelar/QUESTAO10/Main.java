package QUESTAO10;
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("==== Cadastro de Novos Títulos ====");
        biblioteca.adicionarLivro(new Livro("O Tempo Com Voce", "Makoto Shinkay", "ISBN901"));
        biblioteca.adicionarLivro(new Livro("Percy Jackson", "Carlos Figueiredo", "ISBN902"));
        biblioteca.adicionarLivro(new Livro("O homem de giz", "Marina Alves", "ISBN903"));
        biblioteca.adicionarLivro(new Livro("Coraline", "Tiago Monteiro", "ISBN904"));

        System.out.println("\n==== Registro de Leitores ====");
        biblioteca.adicionarUsuario(new UsuarioComum("Sofia", "USR100"));
        biblioteca.adicionarUsuario(new UsuarioPremium("Diego", "USR101"));

        System.out.println("\n==== Catálogo de Livros Disponíveis ====");
        biblioteca.listarLivrosDisponiveis();

        System.out.println("\n==== Empréstimos Realizados ====");
        biblioteca.emprestarLivro("ISBN901", "USR100"); // Sofia
        biblioteca.emprestarLivro("ISBN902", "USR100");
        biblioteca.emprestarLivro("ISBN903", "USR100");
        biblioteca.emprestarLivro("ISBN904", "USR100"); // Deve falhar (limite excedido)

        biblioteca.emprestarLivro("ISBN904", "USR101"); // Diego (premium, sem limite)

        System.out.println("\n==== Atualização do Catálogo ====");
        biblioteca.listarLivrosDisponiveis();

        System.out.println("\n==== Devolução de Livro ====");
        biblioteca.devolverLivro("ISBN902");

        System.out.println("\n==== Catálogo Após Devolução ====");
        biblioteca.listarLivrosDisponiveis();
    }
}
