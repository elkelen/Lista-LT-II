package Q1;

import java.util.Scanner;

public class ProgramaRetangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Retângulo 1:");
        System.out.print("Informe a largura: ");
        double largura1 = sc.nextDouble();
        System.out.print("Informe a altura: ");
        double altura1 = sc.nextDouble();
        Retangulo ret1 = new Retangulo(largura1, altura1);

        
        System.out.println("\nRetângulo 2:");
        System.out.print("Informe a largura: ");
        double largura2 = sc.nextDouble();
        System.out.print("Informe a altura: ");
        double altura2 = sc.nextDouble();
        Retangulo ret2 = new Retangulo(largura2, altura2);

    
        System.out.println("\nResultados do Retângulo 1:");
        ret1.exibirInformacoes();

        System.out.println("\nResultados do Retângulo 2:");
        ret2.exibirInformacoes();

        sc.close();
    }
}
