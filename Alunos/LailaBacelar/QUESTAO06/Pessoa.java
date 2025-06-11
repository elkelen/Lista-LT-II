package QUESTAO06;
public class Pessoa {
    
    String nome;
    int idade;
    Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" +
                "NOME: '" + nome + '\'' +
                ", IDADE: " + idade +
                ", ENDEREÇO: " + endereco +
                '}';
    }
}

