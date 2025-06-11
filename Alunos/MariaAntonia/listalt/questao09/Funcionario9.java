/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao09;

import listalt.questao09.Imprimivel;

/**
 *
 * @author Maria Antônia
 */
public class Funcionario9 implements Imprimivel {
    String nome; 
    String cpf;  
    
    public Funcionario9(String nome, String cpf){
        this.nome = nome; 
        this.cpf = cpf;  
    }
    
    @Override
    public void imprimir(){
        System.out.println("Nome: "+nome+"\nCPF: "+cpf);
    }
}
