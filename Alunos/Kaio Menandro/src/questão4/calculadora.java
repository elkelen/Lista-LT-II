
package LISTA.questão4;

import java.util.Arrays;

public class calculadora {
    
    void somar(int a, int b){
        System.out.println("Soma de A e B: "+(a+b));
        
    }
    
    void somar(double a, double b){
        System.out.println("Soma de A e B: "+(a+b));
        
    }
    
    void somar(int[] valores){
        System.out.println("Soma de A e B: "+Arrays.toString(valores));
        
    }
    
    
    public static void main(String[] args) {
    
    calculadora cint = new calculadora();
    
    int[] valores = {1+ 2+ 3};
    cint.somar(valores);

    cint.somar(3, 3);
    cint.somar(2, 2);
    
    
    
    }
}
