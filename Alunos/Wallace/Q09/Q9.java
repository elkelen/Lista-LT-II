package lista.wallace.Q09;

import java.util.ArrayList;

public class Q9 {

    public static void main(String[] args) {
       ArrayList<Imprimivel> lista = new ArrayList<>();

        lista.add(new Produto("Notebook", 3500));
        lista.add(new Funcionario("Wallace", 4500));

        System.out.println("Imprimindo objetos:");
        for (Imprimivel item : lista) {
            item.imprimir();
        }

        System.out.println("\nAbrindo documentos:");
        Documento relatorio = new Relatorio("Relatorio de Vendas");
        Documento carta = new Carta("Carta de Agradecimento");

        relatorio.abrir();
        carta.abrir();
    }
    
}
