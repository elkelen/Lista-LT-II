package lista.wallace.Q06;

import lista.wallace.Q06.Endereco;

public class Pessoa {
    String nome;
    int idade;
    Endereco endereco;
    
    public Pessoa(String nome, int idade, Endereco endereco){
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    } 
     @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + "\nEndereco: " + endereco;
    }
}
