package lista.wallace.Q10;

import java.util.Scanner;


public class Q10 {

        public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Biblioteca bib = new Biblioteca();
        
        System.out.println("CADASTROS DE LIVROS:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Titulo do livro: ");
            String titulo = scanner.nextLine();

            System.out.print("Autor do livro: ");
            String autor = scanner.nextLine();

            System.out.print("Codigo do livro: ");
            String codigo = scanner.nextLine();

            bib.addLivro(new Livro(titulo, autor, codigo));
            System.out.println();
        }

        // Cadastrar usuários
        System.out.println("CADASTROS DE USUARIOS:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Nome do usuario: ");
            String nome = scanner.nextLine();

            System.out.print("ID do usuario: ");
            String id = scanner.nextLine();

            System.out.print("Tipo (1 = Comum | 2 = Premium): ");
            int tipo = scanner.nextInt();
            scanner.nextLine(); 

            if (tipo == 1) {
                bib.addUsuario(new UsuarioComum(nome, id));
            } else {
                bib.addUsuario(new UsuarioPremium(nome, id));
            }
            System.out.println();
        }

        System.out.println("REALIZAR EMPRESTIMOS:");
        System.out.print("Codigo do livro: ");
        String codLivro = scanner.nextLine();

        System.out.print("ID do usuario: ");
        String idUsuario = scanner.nextLine();

        boolean emprestado = bib.emprestarLivro(codLivro, idUsuario);
        System.out.println("Emprestimo realizado? " + emprestado);

        System.out.println("\nLIVROS DISPONIVEIS:");
        for (Livro livro : bib.listarLivrosDisponiveis()) {
            System.out.println(livro);
        }

        scanner.close();
    }
    
}
