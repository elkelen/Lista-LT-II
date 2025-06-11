/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao1;

import java.util.Scanner;

/**
 *
 * @author curso
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Retangulo r1;
        Retangulo r2;
        double largura;
        double altura;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----------- Retangulo 1 -----------");
        System.out.println("Digite a largura: ");
        largura = sc.nextDouble();
        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();
        
        r1 = new Retangulo(largura, altura);
        
        System.out.println("----------- Retangulo 2 -----------");
        System.out.println("Digite a largura: ");
        largura = sc.nextDouble();
        System.out.println("Digite a altura: ");
        altura = sc.nextDouble();
        
        r2 = new Retangulo(largura, altura);
        
        System.out.println("Area do retangulo 1: " + r1.calcularArea());
        System.out.println("Perimetro do Retangulo 1: " + r1.calcularPerimetro());
        
        System.out.println("Area do retangulo 2: " + r2.calcularArea());
        System.out.println("Perimetro do Retangulo 2: " + r2.calcularPerimetro());
        
    }
    
}
