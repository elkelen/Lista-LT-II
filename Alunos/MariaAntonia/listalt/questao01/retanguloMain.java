/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao01;

import java.util.Scanner;

/**
 *
 * @author Maria Antônia
 */
public class retanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // retangulo 1 
        System.out.println("------ RETÂNGULO 1 -----");
        System.out.println("Digite a ALTURA do retângulo: ");
        double altura1 = scanner.nextDouble(); 
        System.out.println("Digite a LARGURA do retângulo: ");
        double largura1 = scanner.nextDouble(); 
        Retangulo retangulo1= new Retangulo(altura1,largura1); 
        
        
        //retangulo2 
        System.out.println("------ RETÂNGULO 2 -----");
        System.out.println("Digite a ALTURA do retângulo: ");
        double altura2 = scanner.nextDouble(); 
        System.out.println("Digite a LARGURA do retângulo: ");
        double largura2 = scanner.nextDouble(); 
        Retangulo retangulo2= new Retangulo(altura2,largura2); 
        
        // resultados 
        System.out.println("\n------ RESULTADOS ------");
        System.out.printf("RETÂNGULO 1 - Área: %.2f, Perímetro: %.2f\n", retangulo1.calcularArea(), retangulo1.calcularPerimetro());
        System.out.printf("RETÂNGULO 2 - Área: %.2f, Perímetro: %.2f\n", retangulo2.calcularArea(), retangulo2.calcularPerimetro());

        scanner.close();
        
        
        
    }
    
}
