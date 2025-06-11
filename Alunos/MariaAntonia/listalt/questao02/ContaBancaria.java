/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao02;

/**
 *
 * @author Maria Antônia
 */
public class ContaBancaria {
    String numero; 
    String titular; 
    double saldo; 
    
   //construtor 
    public ContaBancaria(String numero, String titular, double saldo){
        this.numero = numero; 
        this. titular = titular; 
        this.saldo = saldo; 
    }
    
    // metodos 
    public void depositar(double valor){
        if(valor>0){
            saldo += valor; //incrementar o valor do deposito ao saldo
            System.out.println("Deposito de "+valor+ " reais realizado"); 
        }else if(valor<0){
            System.out.println("DEPÓSITO INVÁLIDO"); 
        }
    }
    
    // métodos sacar 
    public void sacar(double valor){
        if(valor>0 && valor <= saldo){// aqui as duas condições precisam ser satisfeitas, já que não se pode sacar um valor acima do que existe na conta, por isso valor <=saldo
            saldo -= valor;
           System.out.println("Saque de! " +valor+" realizado");  
        }else if (valor<0 || valor>saldo){
            System.out.println("OPERAÇÃO NÃO PODE SER REALIZADA! TENTE NOVAMENTE.");    
        }
    }
    
    // método mostrarDados() 
    
    public void mostrarDados(){
        System.out.println("Número da conta: "+numero); 
        System.out.println("Titular: "+titular);
        System.out.println("O saldo atual da conta é: "+saldo);
        
    }
    
    // metodo para atualizar o saldo após operaçõe s
    public double getSaldo(){
        return saldo; 
    }
}
