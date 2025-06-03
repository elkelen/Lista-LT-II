/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;

/**
 *
 * @author curso
 */
public class Calculadora {
    public double somar(int a, int b){
        return a + b;
    }
    
    public double somar(double a, double b){
        return a + b;
    }
    
    public double somar(int[] valores){
        double soma = 0;
        for(int i=0;valores.length>i;i++){
            soma += valores[i];
        }
        return soma;
    }
}
