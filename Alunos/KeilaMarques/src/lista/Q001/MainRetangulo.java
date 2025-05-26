
package lista;

import java.util.Scanner;

public class MainRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //retangulo 1
        System.out.println("RETANGULO 01");
        System.out.print("DIGITE A LARGURA: ");
        double largura1 = scanner.nextDouble();
        System.out.print("DIGITE A ALTURA: ");
        double altura1 = scanner.nextDouble();
        Retangulo ret1 = new Retangulo(largura1, altura1);
        
        //retangulo 2
        System.out.println("\nRETANGULO 02");
        System.out.print("DIGITE A LARGURA: ");
        double largura2 = scanner.nextDouble();
        System.out.print("DIGITE A ALTURA: ");
        double altura2 = scanner.nextDouble();
        Retangulo ret2 = new Retangulo(largura2, altura2);
        
        System.out.println("\nRESULTADOS");
        System.out.println("RETANGULO 01 - AREA:" + ret1.calcularArea() + " - PERIMETRO: " + ret1.calcularPerimetro());
        System.out.println("RETANGULO 02 - AREA:" + ret2.calcularArea() + " - PERIMETRO: " + ret2.calcularPerimetro());

        
    }
    
}
