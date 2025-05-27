package lista.wallace.Q02;

public class ContaBancaria {
    String numero;
    String titular;
    double saldo;
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor invalido para deposito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saque não permitido. Saldo insuficiente.");
        }
    }

    public void mostrarDados() {
        System.out.println("Numero da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
    
}
