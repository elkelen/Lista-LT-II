
package lista.Q004;

public class MainCalculadora {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();

        System.out.println("SOMA INT: " + calc.somar(5, 3));
        System.out.println("SOMA DOUBLE: " + calc.somar(5.5, 3.2));

        int[] valores = {1, 2, 3, 4, 5};
        System.out.println("SOMA ARRAY: " + calc.somar(valores));
    }
    
}
