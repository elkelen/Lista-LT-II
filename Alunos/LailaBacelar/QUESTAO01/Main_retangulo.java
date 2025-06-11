package QUESTAO01;
import java.util.Scanner;

public class Main_retangulo {  
    public static void main(String[] args) { 
        Scanner perimetro = new Scanner(System.in);
        
        System.out.println("Para o retangulo 1:");
        System.out.println("Digite largura:");
        double largura1 = perimetro.nextDouble();
        
        System.out.println("Digite altura:");
        double altura1 = perimetro.nextDouble();
        
        retangulo retangulo1 = new retangulo(largura1, altura1);
        retangulo1.largura = largura1;
        retangulo1.altura = altura1;
        
        System.out.println("\nArea do retangulo 1: " + retangulo1.calcularArea());
        System.out.println("Perímetro do retangulo 1: " + retangulo1.calcularPerimetro());
    
        System.out.println("\nPara o retangulo 2:");
        System.out.println("Digite Largura:");
        double largura2 = perimetro.nextDouble();
        
        System.out.println("Digite Altura:");
        double altura2 = perimetro.nextDouble();
        
        retangulo retangulo2 = new retangulo(largura2, altura2);
        retangulo2.largura = largura2;
        retangulo2.altura = altura2;
        
        System.out.println("\nArea do retangulo 2: " + retangulo2.calcularArea());
        System.out.println("Perimetro do retangulo 2: " + retangulo2.calcularPerimetro());

        perimetro.close();
    }
}
