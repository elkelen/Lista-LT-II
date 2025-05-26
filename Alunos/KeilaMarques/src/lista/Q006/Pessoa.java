
package lista.Q006;

public class Pessoa {
   
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa(String nome, int idade, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "PESSOA:\nNOME: " + nome + "\nIDADE: " + idade + "\n" + endereco;
    }
}
