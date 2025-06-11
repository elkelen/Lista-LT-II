/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listalt.questao09;

import listalt.questao09.Funcionario9;
import listalt.questao09.Produto;
import listalt.questao09.Imprimivel;
import java.util.ArrayList;

/**
 *
 * @author Maria Antônia
 */
public class DocumentosMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //listas de produtos 
        ArrayList<Imprimivel> prod = new ArrayList<>(); 
        
        prod.add(new Produto("Perfume",150));
        prod.add(new Produto("Sapato",300));
        prod.add(new Funcionario9 ("Quetle","123.456.789-10"));
        prod.add(new Funcionario9 ("Wallace","109.876.543-21"));
        
        System.out.println("--- PRODUTOS CADASTRADOS ---");
        for(Imprimivel produ : prod){
            produ.imprimir(); 
        }
        
        

    }
    
}
