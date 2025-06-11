package QUESTAO04;
public class Calculadora {
    public int soma (int a, int b){
        return a + b;
    }
    
    public double soma (double a, double b){
        return a + b;
    }
    
    public int soma (int[]valores){
        int soma = 0;
        for (int valor: valores) {
            soma += valor;
        }
        return soma;
    }
    
public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int r1 = calc.soma(10, 10);
        System.out.println("Teste 1 - Método somar(int, int): " + r1);

        double r2 = calc.soma(10.5, 10.5);
        System.out.println("Teste 2 - Método somar(double, double): " + r2);

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int r3 = calc.soma(numeros);
        System.out.println("Teste 3 - Método somar(int[]): " + r3);
    }
}
