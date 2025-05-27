package lista.wallace.Q03;

import java.util.Scanner;


public class Q3 {

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        Aluno aluno1 = new Aluno();
        System.out.println("Aluno 1 criado com valores padrao:");
        aluno1.MostarDados();
        
        System.out.print("\nDigite o nome do aluno: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a matricula: ");
        String matricula = entrada.nextLine();

        System.out.print("Digite o curso: ");
        String curso = entrada.nextLine();

        Aluno aluno2 = new Aluno(nome, matricula, curso);
        System.out.println("Aluno 2 criado com os dados digitados:");
        aluno2.MostarDados();

        entrada.close(); 
    }
    
}
