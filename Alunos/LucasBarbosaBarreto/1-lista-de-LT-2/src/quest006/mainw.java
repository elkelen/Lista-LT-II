package quest006;

import java.util.Scanner;

public class mainw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Dados da pessoa
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine(); // formatacao

        // Dados do endereço
        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Número: ");
        int numero = sc.nextInt();
        sc.nextLine(); // formatacao de novo

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        // Criando objts
        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        // Exibindo
        System.out.println("\n" + pessoa);
        sc.close();
    }
}
