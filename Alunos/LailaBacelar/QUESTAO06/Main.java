package QUESTAO06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===== Cadastro de Pessoa =====\n");
            System.out.print("Digite o nome completo: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade: \n");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nInforme os dados do endereço:");
            System.out.print("Rua: ");
            String rua = scanner.nextLine();
            System.out.print("Número: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Cidade: ");
            String cidade = scanner.nextLine();
            System.out.print("CEP (somente números): ");
            double cep = scanner.nextDouble();

            Endereco endereco = new Endereco(rua, numero, cidade, cep);
            Pessoa pessoa = new Pessoa(nome, idade, endereco);

            System.out.println("\n===== Dados cadastrados =====");
            System.out.println(pessoa);
        }
    }
}

