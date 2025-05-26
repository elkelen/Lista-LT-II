
package lista.Q009;

public class Funcionario implements Imprimivel {

    protected String nome;
    protected String cpf;

    public Funcionario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public void imprimir() {
        System.out.println("FUNCIONARIO: " + nome + " | CPF: " + cpf);
    }
}
