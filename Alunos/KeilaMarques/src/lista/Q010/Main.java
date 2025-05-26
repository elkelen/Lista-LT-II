package lista.Q010;

public class Main {

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(new Livro("DOM QUIXOTE", "MIGUEL DE CERVANTES", "001"));
        biblioteca.adicionarLivro(new Livro("1984", "GEORGE ORWELL", "002"));
        biblioteca.adicionarLivro(new Livro("O SENHOR DOS ANEIS", "J.R.R. TOLKIEN", "003"));
        biblioteca.adicionarLivro(new Livro("ORGULHO E PRECONCEITO", "JANE AUSTEN", "004"));

        biblioteca.adicionarUsuario(new UsuarioComum("CARLOS", "101"));
        biblioteca.adicionarUsuario(new UsuarioPremium("ANA", "102"));

        System.out.println("EMPRESTIMO 001 PARA 101: "
                + (biblioteca.emprestarLivro("001", "101") ? "SUCESSO" : "FALHA"));
        System.out.println("EMPRESTIMO 002 PARA 101: "
                + (biblioteca.emprestarLivro("002", "101") ? "SUCESSO" : "FALHA"));
        System.out.println("EMPRESTIMO 003 PARA 101: "
                + (biblioteca.emprestarLivro("003", "101") ? "SUCESSO" : "FALHA"));
        System.out.println("EMPRESTIMO 004 PARA 101: "
                + (biblioteca.emprestarLivro("004", "101") ? "SUCESSO" : "FALHA")); 
        System.out.println("EMPRESTIMO 004 PARA 102: "
                + (biblioteca.emprestarLivro("004", "102") ? "SUCESSO" : "FALHA"));

        System.out.println("\nLIVROS DISPONIVEIS:");
        for (Livro livro : biblioteca.listarLivrosDisponiveis()) {
            System.out.println(livro);
        }

        System.out.println("\nDEVOLUCAO 001: "
                + (biblioteca.devolverLivro("001") ? "SUCESSO" : "FALHA"));

        biblioteca.relatorioStatus();
    }

}
