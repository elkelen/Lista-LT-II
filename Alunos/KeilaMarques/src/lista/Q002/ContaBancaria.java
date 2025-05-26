
package lista.Q002;

public class ContaBancaria {
    String numero;
    String titular;
    double saldo;

    
    public ContaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("DEPOSITO DE :" + valor + " REALIZADO COM SUCESSO.");
        } else {
            System.out.println("VALOR DE DEPOSITO INVALIDO.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("SAQUE DE:" + valor + " REALIZADO COM SUCESSO.");
            } else {
                System.out.println("SALDO INSUFICIENTE PARA SAQUE DE:" + valor);
            }
        } else {
            System.out.println("VALOR DE SAQUE INVALIDO.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void mostrarDados() {
        System.out.println("\nDADOS DA CONTA:");
        System.out.println("NUMERO: " + numero);
        System.out.println("TITULAR: " + titular);
        System.out.println("SALDO: " + saldo);
    }
}
