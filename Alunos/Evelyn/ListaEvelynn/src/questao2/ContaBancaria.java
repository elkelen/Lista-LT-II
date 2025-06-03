/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author curso
 */
public class ContaBancaria {
    private int numero;
    private String titular;
    private double saldo;
    
    public ContaBancaria(){
        
    }

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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
    
    public void depositar(double valor){
        valor = getSaldo()+ valor;
        setSaldo(valor);
    }
    public void sacar(double valor){
        if(getSaldo()>=valor){
            valor = getSaldo()- valor;
            setSaldo(valor);
        } else{
            System.out.println("Nao foi possivel sacar!!");
        }
    }
    
    public void mostrarDados(){
        System.out.println("-------Dados------\n");
        System.out.println("Numero: " + getNumero() + "\nTitular: " + getTitular() +"\nSaldo: " + getSaldo());
    }

}
