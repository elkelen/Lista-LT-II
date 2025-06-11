package QUESTAO09;
public class InterfaceImprimivel {

    interface Imprimivel {
        void imprimir();
    }

    static class Produto implements Imprimivel {
        private String nome;
        private double preco;

        public Produto(String nome, double preco) {
            this.nome = nome;
            this.preco = preco;
        }

        @Override
        public void imprimir() {
            System.out.println("Descrição do produto: " + nome + " | Preço unitário: R$ " + preco);
        }
    }

    static class Funcionario implements Imprimivel {
        private String nome;
        private String cargo;

        public Funcionario(String nome, String cargo) {
            this.nome = nome;
            this.cargo = cargo;
        }

        @Override
        public void imprimir() {
            System.out.println("Nome do colaborador: " + nome + " | Cargo exercido: " + cargo);
        }
    }

    static abstract class Documento {
        protected String titulo;

        public Documento(String titulo) {
            this.titulo = titulo;
        }

        public abstract void abrir();
    }

    static class Relatorio extends Documento {
        public Relatorio(String titulo) {
            super(titulo);
        }

        @Override
        public void abrir() {
            System.out.println("Abrindo o documento de relatório: " + titulo);
        }
    }

    static class Carta extends Documento {
        public Carta(String titulo) {
            super(titulo);
        }

        @Override
        public void abrir() {
            System.out.println("Exibindo a carta intitulada: " + titulo);
        }
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Tablet", 1800.50);
        Funcionario funcionario = new Funcionario("Roberto", "Supervisor");

        produto.imprimir();
        funcionario.imprimir();

        Documento relatorio = new Relatorio("Relatório Final");
        Documento carta = new Carta("Carta Final");

        relatorio.abrir();
        carta.abrir();
    }
}
