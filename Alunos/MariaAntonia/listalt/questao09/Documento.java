/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao09;

/**
 *
 * @author Maria Antônia
 */
public abstract class Documento {
    String titulo; 
    
    public Documento(String titulo){
        this.titulo = titulo; 
    }
    
    // método abstrato 
    public abstract void abre();
    
}
