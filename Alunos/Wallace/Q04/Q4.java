package lista.wallace.Q04;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro numero inteiro: ");
        int a = scanner.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");
        int b = scanner.nextInt();

        System.out.println("Resultado da soma (int): " + calc.somar(a, b));

        System.out.print("Digite o primeiro numero decimal: ");
        double x = scanner.nextDouble();

        System.out.print("Digite o segundo numero decimal: ");
        double y = scanner.nextDouble();

        System.out.println("Resultado da soma (double): " + calc.somar(x, y));

        System.out.print("Quantos números deseja somar no vetor? ");
        int quantidade = scanner.nextInt();
        int[] vetor = new int[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Resultado da soma (vetor): " + calc.somar(vetor));

        scanner.close();
    }
    
}
