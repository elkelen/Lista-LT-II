package LISTA.questao2;
import java.util.Scanner;

public class banco {
    double a;
    
    public static void main(String[] args) {
        
    
    Scanner dep = new Scanner(System.in); 
    contabancaria cont = new contabancaria(123123123, 1000, "Kaio", 0);
    
    
    System.out.println("BEM VINDO!!");
    cont.saldoinicial();
    
    
    System.out.println("\n\nDigite 1 para efetuar um deposito e 2 para efetuar um saque: ");
    double a = dep.nextDouble();
    
    
        if (a == 1){
         System.out.println("\n\nDigite o valor a ser depositado: ");
             double valor1 = dep.nextDouble();
             cont.valor = valor1;
             cont.depositar();
             cont.saldofinal();
                
        } else {
            System.out.println("\n\nDigite o valor a ser sacado: ");
                double valor2 = dep.nextDouble();
                
                cont.valor = valor2;
                cont.saque();
               // cont.saldofinal();
         
        }
        
    }
}
