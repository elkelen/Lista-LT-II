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
public class Produto implements Imprimivel {
   String nome; 
   double preco; 
   
   public Produto (String nome, double preco){
       this.nome = nome; 
       this.preco= preco; 
   }
   
   // método imprimir 
   @Override
   public void imprimir(){
       System.out.println("Produto: "+nome+"\nPreço: "+preco+" reais");
    }
}
