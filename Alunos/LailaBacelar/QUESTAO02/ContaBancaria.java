package QUESTAO02;
public class ContaBancaria{
    double numero;
    String titular;
    double saldo;

    public ContaBancaria(double numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("\nDepósito de R$" + valor + " efetuado com sucesso.");
        } else {
            System.out.println("\nValor de depósito inválido. Por favor, insira um valor positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
                System.out.println("\nSaque de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("\nOperação não realizada. Saldo insuficiente.");
            }
        } else {
            System.out.println("\nValor de saque inválido. Por favor, insira um valor positivo.");
        }
    }

    public void mostrarDados() {
        System.out.println("=== Dados da Conta ===");
        System.out.println("Número da Conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo Atual: R$%.2f\n", saldo);
    }
}
