
package lista.Q002;

public class MainContaB {

    public static void main(String[] args) {
        
        ContaBancaria conta = new ContaBancaria("12345-6", "JOAO SILVA", 1000.0);

        conta.mostrarDados();

        System.out.println("\nTENTANDO DEPOSITAR 500.00");
        conta.depositar(500.0);
        System.out.println("SALDO APOS DEPOSITO: " + conta.getSaldo());

        System.out.println("\nTENTANDO SACAR 200.00");
        conta.sacar(200.0);
        System.out.println("SALDO APOS SAQUE: " + conta.getSaldo());

        System.out.println("\nTENTANDO SACAR 2000.00");
        conta.sacar(2000.0);
        System.out.println("SALDO APOS TENTATIVA DE SAQUE: " + conta.getSaldo());

        conta.mostrarDados();
    }
    
}
