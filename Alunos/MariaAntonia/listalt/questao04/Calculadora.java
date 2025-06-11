/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao04;

/**
 *
 * @author Maria Antônia
 */
public class Calculadora {
   
    // método somar inteiros 
    public int somar (int a, int b){
        return a + b;
    }
    
    // método somar números decimais 
    public double somar (double a, double b){
        return a + b; 
    }
    
    // método que soma vários números 
    public int somar (int []valores){
        int soma = 0; // variavél que auxilia, acumulando todos os valores 
        for (int valor : valores){// tipo variavel(individual) : array (todo) quero percorrer
            soma = soma +valor; 
        }
        return soma; 
    }
}
