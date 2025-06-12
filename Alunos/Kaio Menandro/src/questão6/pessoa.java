
package LISTA.questão6;

import LISTA.questão6.endereco;

public class pessoa {
   
    
    String nome;
    int idade;
    endereco enderecoo;

    public pessoa(String nome, int idade, endereco enderecoo) {
        this.nome = nome;
        this.idade = idade;
        this.enderecoo = enderecoo;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco=" + enderecoo +
                '}';
    }
}
    

