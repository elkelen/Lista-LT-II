/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listalt.questao01;

/**
 *
 * @author Maria Antônia
 */
public class Retangulo {
    double altura; 
    double largura; 
    
    // construtor 
    public Retangulo(double altura, double largura){
        this.altura = altura; 
        this.largura = largura; 
    }
    
    // método calcularArea 
    public double calcularArea(){
        return largura * altura; 
    }
    
    //método calcularPerímetro 
    
    public double calcularPerimetro(){
        return 2* (largura + altura ); 
    }
}
