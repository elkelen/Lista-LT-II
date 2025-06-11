/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao09;

import listalt.questao09.Documento;

/**
 *
 * @author Maria Antônia
 */
public class Carta extends Documento {
    
    public Carta(String titulo){
        super(titulo);
    }
    
    @Override
    public void abre(){
        System.out.println("Carta aberta: "+titulo);
    }
}
