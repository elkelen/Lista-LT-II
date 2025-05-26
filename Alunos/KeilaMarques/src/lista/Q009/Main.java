
package lista.Q009;

public class Main {

    public static void main(String[] args) {
     
        Imprimivel[] imprimiveis = {
            new Produto("TECLADO", 150.99),
            new Funcionario("WILD ", "123.456.789-00")
        };

        for (Imprimivel item : imprimiveis) {
            item.imprimir();
        }

        Documento doc1 = new Relatorio("VENDAS 2023");
        Documento doc2 = new Carta("RECOMENDACAO");

        doc1.abrir();
        doc2.abrir();
    }

}
