/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;

import java.util.Scanner;

/**
 *
 * @author curso
 */
public class Principal4 {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        double c, d;
        
        System.out.println("Digite dois numeros inteiros: ");
        a = sc.nextInt();
        b = sc.nextInt();
        
        System.out.println("Soma: " + cal.somar(a, b));
        
        System.out.println("Digite dois numeros do tipo double: ");
        c = sc.nextDouble();
        d = sc.nextDouble();
        System.out.println("Soma: " + cal.somar(c, d));
        
        System.out.println("Digite quantos numeros deseja somar: ");
        int x = sc.nextInt();
        
        int lista[] = new int[x];
        
        System.out.println("Digite os numeros: ");
        
       for(int i = 0; i<x; i++){
           lista[i] = sc.nextInt();
       }
       
        System.out.println("Soma: " + cal.somar(lista));
    }
}
