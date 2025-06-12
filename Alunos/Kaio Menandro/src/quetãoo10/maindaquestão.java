
package LISTA.quetãoo10;

public class maindaquestão {
    
    public static void main(String[] args) {
    biblioteca biblioteca = new biblioteca();

        biblioteca.adicionarLivro(new livro("Java Básico", "José Silva", "ISBN001"));
        biblioteca.adicionarLivro(new livro("POO Avançada", "Maria Souza", "ISBN002"));
        biblioteca.adicionarLivro(new livro("Estruturas de Dados", "Carlos Lima", "ISBN003"));
        biblioteca.adicionarLivro(new livro("Banco de Dados", "Ana Clara", "ISBN004"));

        // Adicionando usuários
        biblioteca.adicionarUsuario(new usuarioc("João", "U001"));
        biblioteca.adicionarUsuario(new usuariop("Mariana", "U002"));

        // Listando livros disponíveis
        biblioteca.listarLivrosDisponiveis();

        // Fazendo empréstimos
        biblioteca.emprestarLivro("ISBN001", "U001"); // João
        biblioteca.emprestarLivro("ISBN002", "U001");
        biblioteca.emprestarLivro("ISBN003", "U001");
        biblioteca.emprestarLivro("ISBN004", "U001"); // Deve dar erro (limite)

        biblioteca.emprestarLivro("ISBN004", "U002"); // Mariana (premium, sem limite)

        // Listando livros disponíveis após empréstimos
        biblioteca.listarLivrosDisponiveis();

        // Devolvendo livro
        biblioteca.devolverLivro("ISBN002");

        // Listando livros após devolução
        biblioteca.listarLivrosDisponiveis();
    }
}
