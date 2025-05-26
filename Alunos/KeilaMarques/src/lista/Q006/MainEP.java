
package lista.Q006;

import java.util.Scanner;

public class MainEP {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("INFORME O NOME:");
        String nome = scanner.nextLine();

        System.out.println("INFORME A IDADE:");
        int idade = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("INFORME A RUA:");
        String rua = scanner.nextLine();

        System.out.println("INFORME O NUMERO:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("INFORME A CIDADE:");
        String cidade = scanner.nextLine();

        System.out.println("INFORME O CEP:");
        String cep = scanner.nextLine();

        Endereco endereco = new Endereco(rua, numero, cidade, cep);
        Pessoa pessoa = new Pessoa(nome, idade, endereco);

        System.out.println("\nDADOS CADASTRADOS:\n" + pessoa);
    }
    
}
