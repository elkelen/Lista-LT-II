package lista.wallace.Q06;

import java.util.Scanner;

public class Q6 {

    
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade");
        int idade = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Digite a rua");
        String rua = entrada.nextLine();
        System.out.println("Digite o numero");
        int numero = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Digite o cep");
        String cep = entrada.nextLine();
        System.out.println("Digite a cidade");
        String cidade = entrada.nextLine();
        
        Endereco endereco = new Endereco(rua, numero, cep, cidade);
         Pessoa pessoa = new Pessoa(nome, idade, endereco);
         
        System.out.println("\nDados cadastrados:");
        System.out.println(pessoa);
    }
    
}
