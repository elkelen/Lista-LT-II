package Q10;

public class Main {
    public static void main(String[] args) {
        // 1. Criação da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // 2. Adicionar livros ao acervo
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "978-3-16-148410-0"));
        biblioteca.adicionarLivro(new Livro("Duna", "Frank Herbert", "978-0-44-101359-3"));
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell", "978-0-45-228423-4"));
        biblioteca.adicionarLivro(new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams", "978-0-34-539180-3"));

        // 3. Adicionar usuários
        biblioteca.adicionarUsuario(new UsuarioComum("Ana", "101"));
        biblioteca.adicionarUsuario(new UsuarioPremium("Carlos", "202"));

        System.out.println("--- Bem-vindo à Biblioteca! ---\n");

        System.out.println("** 1. Listando livros no início:**");
        biblioteca.listarLivrosDisponiveis();
        System.out.println("\n--------------------------------------------------\n");
        
        System.out.println("** 2. Ana (Usuária Comum) tenta pegar 4 livros:**");
        biblioteca.emprestarLivro("978-3-16-148410-0", "101"); // Empréstimo 1
        biblioteca.emprestarLivro("978-0-44-101359-3", "101"); // Empréstimo 2
        biblioteca.emprestarLivro("978-0-45-228423-4", "101"); // Empréstimo 3
        biblioteca.emprestarLivro("978-0-34-539180-3", "101"); // Tentativa de empréstimo 4 (deve falhar)
        System.out.println("\n--------------------------------------------------\n");

        System.out.println("** 3. Carlos (Usuário Premium) pega um livro:**");
        biblioteca.emprestarLivro("978-0-34-539180-3", "202");
        System.out.println("\n--------------------------------------------------\n");

        System.out.println("** 4. Tentativa de pegar um livro já emprestado:**");
        biblioteca.emprestarLivro("978-3-16-148410-0", "202");
        System.out.println("\n--------------------------------------------------\n");

        System.out.println("** 5. Listando livros disponíveis agora:**");
        biblioteca.listarLivrosDisponiveis();
        System.out.println("\n--------------------------------------------------\n");
        
        System.out.println("** 6. Ana devolve um livro:**");
        biblioteca.devolverLivro("978-0-44-101359-3");
        System.out.println("\n--------------------------------------------------\n");

        System.out.println("** 7. Listando livros disponíveis no final:**");
        biblioteca.listarLivrosDisponiveis();
        System.out.println("\n--- Fim da Simulação ---");
    }
}