package lista.wallace.Q01;

import java.util.Scanner;


public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a largura do primeiro retangulo");
        double largura1 = scanner.nextDouble();
        
        System.out.println("Digite a altura do primeiro retangulo");
        double altura1 = scanner.nextDouble();
        
        Retangulo ret1 = new Retangulo(altura1, largura1);
        
        System.out.println("Digite a largura do segundo retangulo");
        double largura2 = scanner.nextDouble();
        
        System.out.println("Digite a altura do segundo retangulo");
        double altura2 = scanner.nextDouble();
        
        Retangulo ret2 = new Retangulo(altura2, largura2);
        
        System.out.println("Retangulo 1:");
        System.out.println("area: " + ret1.calcularArea());
        System.out.println("Perimetro: " + ret1.calcularPerimetro());

        System.out.println("\nRetangulo 2:");
        System.out.println("area: " + ret2.calcularArea());
        System.out.println("Perimetro: " + ret2.calcularPerimetro());

        scanner.close();
    }
       
    }
    

