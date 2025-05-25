package lista.wallace.Q09;

import lista.wallace.Q09.Imprimivel;

public class Produto implements  Imprimivel {
    String nome;
    double preco;
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public void imprimir() {
        System.out.println("PRODUTO: " + nome + " | R$" + preco);
    }
}
